# coding: utf-8

from typing import List

from fastapi import Depends, Security  # noqa: F401
from fastapi.openapi.models import OAuthFlowImplicit, OAuthFlows  # noqa: F401
from fastapi.security import (  # noqa: F401
    HTTPAuthorizationCredentials,
    HTTPBasic,
    HTTPBasicCredentials,
    HTTPBearer,
    OAuth2,
    OAuth2AuthorizationCodeBearer,
    OAuth2PasswordBearer,
    SecurityScopes,
)
from fastapi.security.api_key import APIKeyCookie, APIKeyHeader, APIKeyQuery  # noqa: F401

from openapi_server.models.extra_models import TokenModel


basic_auth = HTTPBasic()


def get_token_basic(
    credentials: HTTPBasicCredentials = Depends(basic_auth)
) -> TokenModel:
    """
    Check and retrieve authentication information from basic auth.

    :param credentials Credentials provided by Authorization header
    :type credentials: HTTPBasicCredentials
    :rtype: TokenModel | None
    """

    ...

oauth2_code = OAuth2AuthorizationCodeBearer(
    authorizationUrl="https://www.pinterest.com/oauth/",
    tokenUrl="https://api.pinterest.com/v5/oauth/token",
    refreshUrl="",
    scopes={
        "ads:read": "See all of your advertising data, including ads, ad groups, campaigns etc.",
        "ads:write": "Create, update, or delete ads, ad groups, campaigns etc.",
        "boards:read": "See your public boards, including group boards you join",
        "boards:read_secret": "See your secret boards",
        "boards:write": "Create, update, or delete your public boards",
        "boards:write_secret": "Create, update, or delete your secret boards",
        "catalogs:read": "See all of your catalogs data",
        "catalogs:write": "Create, update, or delete your catalogs data",
        "pins:read": "See your public Pins",
        "pins:read_secret": "See your secret Pins",
        "pins:write": "Create, update, or delete your public Pins",
        "pins:write_secret": "Create, update, or delete your secret Pins",
        "user_accounts:read": "See your user accounts",
    }
)


def get_token_pinterest_oauth2(
    security_scopes: SecurityScopes, token: str = Depends(oauth2_code)
) -> TokenModel:
    """
    Validate and decode token.

    :param token Token provided by Authorization header
    :type token: str
    :return: Decoded token information or None if token is invalid
    :rtype: TokenModel | None
    """

    ...


def validate_scope_pinterest_oauth2(
    required_scopes: SecurityScopes, token_scopes: List[str]
) -> bool:
    """
    Validate required scopes are included in token scope

    :param required_scopes Required scope to access called API
    :type required_scopes: List[str]
    :param token_scopes Scope present in token
    :type token_scopes: List[str]
    :return: True if access to called API is allowed
    :rtype: bool
    """

    return False

