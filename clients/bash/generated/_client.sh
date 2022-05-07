#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "adAccountAnalytics[Get ad account analytics]" \
            "adAccountsList[List ad accounts]" \
            "adGroupsAnalytics[Get ad group analytics]" \
            "adGroupsList[List ad groups]" \
            "adsAnalytics[Get ad analytics]" \
            "adsList[List ads]" \
            "analyticsCreateReport[Create async request for an account analytics report]" \
            "analyticsGetReport[Get the account analytics report created by the async call]" \
            "campaignsAnalytics[Get campaign analytics]" \
            "campaignsList[List campaigns]" \
            "productGroupsAnalytics[Get product group analytics]"             "boardSectionsCreate[Create board section]" \
            "boardSectionsDelete[Delete board section]" \
            "boardSectionsList[List board sections]" \
            "boardSectionsListPins[List Pins on board section]" \
            "boardSectionsUpdate[Update board section]" \
            "boardsCreate[Create board]" \
            "boardsDelete[Delete board]" \
            "boardsGet[Get board]" \
            "boardsList[List boards]" \
            "boardsListPins[List Pins on board]" \
            "boardsUpdate[Update board]"             "catalogsProductGroupsCreate[Create product group]" \
            "catalogsProductGroupsDelete[Delete product group]" \
            "catalogsProductGroupsList[Get product groups list]" \
            "catalogsProductGroupsUpdate[Update product group]" \
            "feedProcessingResultsList[List processing results for a given feed]" \
            "feedsCreate[Create feed]" \
            "feedsDelete[Delete feed]" \
            "feedsGet[Get feed]" \
            "feedsList[List feeds]" \
            "feedsUpdate[Update feed]" \
            "itemsBatchGet[Get catalogs items batch]" \
            "itemsBatchPost[Perform an operation on an item batch]" \
            "itemsGet[Get catalogs items]"             "mediaCreate[Register media upload]" \
            "mediaGet[Get media upload details]" \
            "mediaList[List media uploads]"             "oauthToken[Generate OAuth access token]"             "pinsAnalytics[Get Pin analytics]" \
            "pinsCreate[Create Pin]" \
            "pinsDelete[Delete Pin]" \
            "pinsGet[Get Pin]"             "userAccountAnalytics[Get user account analytics]" \
            "userAccountGet[Get user account]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      adAccountAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"columns=:[QUERY] Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] Granularity"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
"include_shared_accounts=true:[QUERY] Include shared ad accounts"
          "include_shared_accounts=false:[QUERY] Include shared ad accounts"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"ad_group_ids=:[QUERY] List of Ad group Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] Granularity"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"ad_group_ids=:[QUERY] List of Ad group Ids to use to filter the results."
"entity_statuses=:[QUERY] Entity status"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"translate_interests_to_names=true:[QUERY] Return interests as text names (if value is true) rather than topic IDs."
          "translate_interests_to_names=false:[QUERY] Return interests as text names (if value is true) rather than topic IDs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"ad_ids=:[QUERY] List of Ad Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] Granularity"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"ad_group_ids=:[QUERY] List of Ad group Ids to use to filter the results."
"ad_ids=:[QUERY] List of Ad Ids to use to filter the results."
"entity_statuses=:[QUERY] Entity status"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      analyticsCreateReport)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      analyticsGetReport)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "token=:[QUERY] Token returned from the post request creation call"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] Granularity"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"entity_statuses=:[QUERY] Entity status"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"product_group_ids=:[QUERY] List of Product group Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] Granularity"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsCreate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsDelete)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsList)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsListPins)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsDelete)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsGet)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
"privacy=:[QUERY] Privacy setting for a board."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsListPins)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsDelete)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsList)
        local -a _op_arguments
        _op_arguments=(
                    "feed_id=:[QUERY] Unique identifier of a feed"
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedProcessingResultsList)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsDelete)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsGet)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsBatchGet)
        local -a _op_arguments
        _op_arguments=(
          "batch_id=:[PATH] Id of a catalogs items batch to fetch"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsGet)
        local -a _op_arguments
        _op_arguments=(
                    "country=:[QUERY] Country for the Catalogs Items"
"item_ids=:[QUERY] Catalos Item ids"
"language=:[QUERY] Language for the Catalogs Items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      mediaCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      mediaGet)
        local -a _op_arguments
        _op_arguments=(
          "media_id=:[PATH] Media identifier"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      mediaList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      oauthToken)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"metric_types=:[QUERY] Pin metric types to get data for, default is all."
"split_field=:[QUERY] How to split the data into groups. Not including this param means data won&#39;t be split."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsDelete)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsGet)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountAnalytics)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD"
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD"
"from_claimed_content=:[QUERY] Filter on Pins that match your claimed domain."
"pin_format=:[QUERY] Pin formats to get data for, default is all."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"metric_types=:[QUERY] Metric types to get data for, default is all."
"split_field=:[QUERY] How to split the data into groups. Not including this param means data won&#39;t be split."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountGet)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
