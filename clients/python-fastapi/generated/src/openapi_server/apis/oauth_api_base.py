# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import Any, Optional
from typing_extensions import Annotated
from openapi_server.models.conversion_access_token_response import ConversionAccessTokenResponse
from openapi_server.models.error import Error
from openapi_server.models.oauth_access_token_response import OauthAccessTokenResponse
from openapi_server.security_api import get_token_pinterest_oauth2, get_token_basic

class BaseOauthApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseOauthApi.subclasses = BaseOauthApi.subclasses + (cls,)
    async def oauth_conversion_token(
        self,
    ) -> ConversionAccessTokenResponse:
        """Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token."""
        ...


    async def oauth_token(
        self,
        grant_type: StrictStr,
    ) -> OauthAccessTokenResponse:
        """Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token."""
        ...


    async def token_revoke(
        self,
        token: Annotated[StrictStr, Field(description="The token to revoke.")],
        token_type_hint: Annotated[Optional[StrictStr], Field(description="The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.")],
    ) -> None:
        """Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable."""
        ...
