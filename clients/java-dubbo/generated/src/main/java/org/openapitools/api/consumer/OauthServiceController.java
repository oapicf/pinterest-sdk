package org.openapitools.api.consumer;

import org.openapitools.model.ConversionAccessToken;
import org.openapitools.model.OauthAccessToken;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.TokenGrantType;
import org.openapitools.model.TokenTypeHint;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.OauthService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/oauth")
public class OauthServiceController {

    @DubboReference
    private OauthService oauthService;

    @RequestMapping(method = RequestMethod.POST, value = "/conversion_token")
    public ConversionAccessToken oauthConversionToken(
    ) {
        return oauthService.oauthConversionToken();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/token")
    public OauthAccessToken oauthToken(
        @RequestParam(name = "grantType") TokenGrantType grantType,
        @RequestParam(name = "code") String code,
        @RequestParam(name = "continuousRefresh") String continuousRefresh,
        @RequestParam(name = "redirectUri") String redirectUri,
        @RequestParam(name = "refreshToken") String refreshToken,
        @RequestParam(name = "scope") String scope
    ) {
        return oauthService.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/token/revoke")
    public void tokenRevoke(
        @RequestParam(name = "token") String token,
        @RequestParam(name = "tokenTypeHint") TokenTypeHint tokenTypeHint
    ) {
        oauthService.tokenRevoke(token, tokenTypeHint);
    }
}
