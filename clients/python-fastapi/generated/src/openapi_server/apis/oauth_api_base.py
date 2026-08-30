# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_access_token import ConversionAccessToken
from openapi_server.models.oauth_access_token import OauthAccessToken
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.token_grant_type import TokenGrantType
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_basic

class BaseOauthApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOauthApi.subclasses = BaseOauthApi.subclasses + (cls,)
    async def oauth_conversion_token(
        self,
    ) -> ConversionAccessToken:
        """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token."""
        ...


    async def oauth_token(
        self,
        grant_type: TokenGrantType,
        code: Optional[StrictStr],
        continuous_refresh: Annotated[Optional[StrictStr], Field(description="  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.")],
        redirect_uri: Optional[StrictStr],
        refresh_token: Optional[StrictStr],
        scope: Optional[StrictStr],
    ) -> OauthAccessToken:
        """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the &#x60;continuous_refresh&#x60; parameter to &#x60;true&#x60; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. """
        ...


    async def token_revoke(
        self,
        token: Annotated[StrictStr, Field(description="The token to revoke.")],
        token_type_hint: Annotated[Optional[Any], Field(description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.")],
    ) -> None:
        """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable."""
        ...
