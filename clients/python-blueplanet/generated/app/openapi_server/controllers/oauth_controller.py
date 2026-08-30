import connexion

from app.openapi_server.models.conversion_access_token import ConversionAccessToken  # noqa: E501
from app.openapi_server.models.oauth_access_token import OauthAccessToken  # noqa: E501
from app.openapi_server.models.pinterest_lib_error import PinterestLibError  # noqa: E501
from app.openapi_server.models.token_grant_type import TokenGrantType  # noqa: E501
from app.openapi_server.models.token_type_hint import TokenTypeHint  # noqa: E501
from openapi_server import util


def oauth_conversion_token():  # noqa: E501
    """Generate OAuth access token for conversion API

    Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token. # noqa: E501


    :rtype: ConversionAccessToken
    """
    return 'do some magic!'


def oauth_token(grant_type, code=None, continuous_refresh=None, redirect_uri=None, refresh_token=None, scope=None):  # noqa: E501
    """Generate OAuth access token

    Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token.  # noqa: E501

    :param grant_type: 
    :type grant_type: dict | bytes
    :param code: 
    :type code: str
    :param continuous_refresh:   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
    :type continuous_refresh: str
    :param redirect_uri: 
    :type redirect_uri: str
    :param refresh_token: 
    :type refresh_token: str
    :param scope: 
    :type scope: str

    :rtype: OauthAccessToken
    """
    if connexion.request.is_json:
        grant_type = TokenGrantType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def token_revoke(token, token_type_hint=None):  # noqa: E501
    """Revoke a token

    Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable. # noqa: E501

    :param token: The token to revoke.
    :type token: str
    :param token_type_hint: The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
    :type token_type_hint: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        token_type_hint = TokenTypeHint.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
