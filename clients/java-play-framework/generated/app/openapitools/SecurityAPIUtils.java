package openapitools;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.typesafe.config.Config;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import play.mvc.Http;

import java.net.URL;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Singleton
public class SecurityAPIUtils {
    private static final String BEARER_PREFIX = "Bearer ";
    private final ObjectMapper mapper;

    private static final boolean USE_ONLINE_VALIDATION = false;

    // Online validation
    private final HashMap<String, String> tokenIntrospectEndpoints = new HashMap<>();
    private final String clientId;
    private final String clientSecret;
    private final long leeway;

    // Offline validation
    private final HashMap<String, String> jwksEndpoints = new HashMap<>();
    private String tokenKeyId = "";
    private JWTVerifier tokenVerifier; //Reusable verifier instance until tokenKeyId changes.

    @Inject
    SecurityAPIUtils(Config configuration) {
        mapper = new ObjectMapper();

        clientId = configuration.hasPath("oauth.clientId") ? configuration.getString("oauth.clientId") : "";
        clientSecret = configuration.hasPath("oauth.clientSecret") ? configuration.getString("oauth.clientSecret") : "";
        leeway = configuration.hasPath("oauth.leeway") ? configuration.getLong("oauth.leeway") : 3;

        tokenIntrospectEndpoints.put("pinterest_oauth2", "");
        tokenIntrospectEndpoints.put("client_credentials", "");

        jwksEndpoints.put("pinterest_oauth2", "");
        jwksEndpoints.put("client_credentials", "");
    }

    //This function is not currently used because we hardcode USE_ONLINE_VALIDATION to false but might in the future versions
    private boolean isRequestTokenValidByOnlineCheck(Http.Request request, String securityMethodName) {
        try {
            Optional<String> authToken = request.getHeaders().get(HttpHeaders.AUTHORIZATION);

            if (authToken.isPresent()) {
                String tokenWithoutBearerPrefix = authToken.get().substring(BEARER_PREFIX.length());

                HttpClientBuilder builder = HttpClientBuilder.create();
                HttpClient httpClient = builder.build();
                HttpPost httppost = new HttpPost(this.tokenIntrospectEndpoints.get(securityMethodName));

                List<NameValuePair> params = new ArrayList<>();
                params.add(new BasicNameValuePair("token", tokenWithoutBearerPrefix));
                params.add(new BasicNameValuePair("client_id", clientId));
                params.add(new BasicNameValuePair("client_secret", clientSecret));
                httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

                HttpResponse response = httpClient.execute(httppost);
                String responseJsonString = EntityUtils.toString(response.getEntity());
                JsonNode responseJsonObject = mapper.readTree(responseJsonString);

                return response.getStatusLine().getStatusCode() == HttpStatus.SC_OK && responseJsonObject.get("active").asBoolean();
            }
        } catch (Exception exception) {
            return false;
        }

        return false;
    }

    private boolean isRequestTokenValidByOfflineCheck(Http.Request request, String securityMethodName) {
        try {
            Optional<String> authHeader = request.getHeaders().get(HttpHeaders.AUTHORIZATION);

            if (authHeader.isPresent()) {
                String bearerToken = authHeader.get().substring(BEARER_PREFIX.length());
                return isTokenValidByOfflineCheck(bearerToken, securityMethodName);
            }
        } catch (Exception exception) {
            return false;
        }

        return false;
    }

    public boolean isTokenValidByOfflineCheck(String bearerToken, String securityMethodName) {
        try {
            DecodedJWT jwt = JWT.decode(bearerToken);
            String issuer = jwt.getIssuer();
            String keyId = jwt.getKeyId();
            if (!tokenKeyId.equals(keyId)) {
                Optional<String> optionalSecurityMethodName = jwksEndpoints.keySet().stream().findFirst();
                if (securityMethodName == null && optionalSecurityMethodName.isPresent()) {
                    securityMethodName = optionalSecurityMethodName.get();
                }

                Jwk jwk = new UrlJwkProvider(new URL(this.jwksEndpoints.get(securityMethodName))).get(keyId);
                final PublicKey publicKey = jwk.getPublicKey();

                if (!(publicKey instanceof RSAPublicKey)) {
                    throw new IllegalArgumentException(String.format("Key with ID %s was found in JWKS but is not a RSA-key.", keyId));
                }

                Algorithm algorithm = Algorithm.RSA256((RSAPublicKey) publicKey, null);
                tokenVerifier = JWT.require(algorithm)
                        .withIssuer(issuer)
                        .acceptLeeway(leeway)
                        .build();
                tokenKeyId = keyId;
            }

            tokenVerifier.verify(bearerToken);

            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public String getOAuthUserIdFromRequestToken(Http.Request requestWithPreviouslyVerifiedToken) {
        try {
            Optional<String> authHeader = requestWithPreviouslyVerifiedToken.getHeaders().get(HttpHeaders.AUTHORIZATION);
            if (authHeader.isPresent()) {
                String bearerToken = authHeader.get().substring(BEARER_PREFIX.length());
                return getOAuthUserIdFromToken(bearerToken);
            }
        } catch (Exception exception) {
            return null;
        }

        return null;
    }

    public String getOAuthUserIdFromToken(String bearerToken) {
        try {
            DecodedJWT jwt = JWT.decode(bearerToken);
            return jwt.getSubject();
        } catch (Exception exception) {
            return null;
        }
    }

    public boolean isRequestTokenValid(Http.Request request, String securityMethodName) {
        return USE_ONLINE_VALIDATION ? isRequestTokenValidByOnlineCheck(request, securityMethodName) : isRequestTokenValidByOfflineCheck(request, securityMethodName);
    }
}
