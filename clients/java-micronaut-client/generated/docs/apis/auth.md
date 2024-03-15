# Authorization methods
<a id="name"></a>
# pinterest_oauth2
Authorization method is **OAuth2** with `accessCode` flow.
The scopes are: 
    * `ads:read`
    * `ads:write`
    * `billing:read`
    * `billing:write`
    * `biz_access:read`
    * `biz_access:write`
    * `boards:read`
    * `boards:read_secret`
    * `boards:write`
    * `boards:write_secret`
    * `catalogs:read`
    * `catalogs:write`
    * `pins:read`
    * `pins:read_secret`
    * `pins:write`
    * `pins:write_secret`
    * `user_accounts:read`
    * `user_accounts:write`

It can be configured in the [application.yml](src/main/resources/application.yml) using Micronaut security features.

More information on configuring can be found in [Micronaut Security Guide](https://micronaut-projects.github.io/micronaut-security/latest/guide/#oauth).
<a id="name"></a>
# conversion_token
<a id="name"></a>
# basic
Authorization method is of **basic auth**.

It can be configured in the [application.yml](src/main/resources/application.yml) using Micronaut security features.
