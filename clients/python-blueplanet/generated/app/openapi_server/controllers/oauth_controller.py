import connexion

from app.openapi_server.models.conversion_access_token_response import ConversionAccessTokenResponse  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse  # noqa: E501
from openapi_server import util


def oauth_conversion_token():  # noqa: E501
    """Generate OAuth access token for conversion API

    Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token. # noqa: E501


    :rtype: ConversionAccessTokenResponse
    """
    return 'do some magic!'


def oauth_token(grant_type):  # noqa: E501
    """Generate OAuth access token

    Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token. # noqa: E501

    :param grant_type: 
    :type grant_type: str

    :rtype: OauthAccessTokenResponse
    """
    return 'do some magic!'


def token_revoke(token, token_type_hint=None):  # noqa: E501
    """Revoke a token

    Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable. # noqa: E501

    :param token: The token to revoke.
    :type token: str
    :param token_type_hint: The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
    :type token_type_hint: str

    :rtype: None
    """
    return 'do some magic!'
