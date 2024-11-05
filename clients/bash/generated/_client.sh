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
# ! Generator version: 7.9.0
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
            "adAccountTargetingAnalyticsGet[Get targeting analytics for an ad account]" \
            "adAccountsCreate[Create ad account]" \
            "adAccountsGet[Get ad account]" \
            "adAccountsList[List ad accounts]" \
            "analyticsCreateMmmReport[Create a request for a Marketing Mix Modeling (MMM) report]" \
            "analyticsCreateReport[Create async request for an account analytics report]" \
            "analyticsCreateTemplateReport[Create async request for an analytics report using a template]" \
            "analyticsGetMmmReport[Get advertiser Marketing Mix Modeling (MMM) report.]" \
            "analyticsGetReport[Get the account analytics report created by the async call]" \
            "sandboxDelete[Delete ads data for ad account in API Sandbox]" \
            "templatesList[List templates]"             "adGroupsAnalytics[Get ad group analytics]" \
            "adGroupsAudienceSizing[Get audience sizing]" \
            "adGroupsBidFloorGet[Get bid floors]" \
            "adGroupsCreate[Create ad groups]" \
            "adGroupsGet[Get ad group]" \
            "adGroupsList[List ad groups]" \
            "adGroupsTargetingAnalyticsGet[Get targeting analytics for ad groups]" \
            "adGroupsUpdate[Update ad groups]"             "adPreviewsCreate[Create ad preview with pin or image]" \
            "adTargetingAnalyticsGet[Get targeting analytics for ads]" \
            "adsAnalytics[Get ad analytics]" \
            "adsCreate[Create ads]" \
            "adsGet[Get ad]" \
            "adsList[List ads]" \
            "adsUpdate[Update ads]"             "advancedAuctionItemsGetPost[Get item bid options (POST)]" \
            "advancedAuctionItemsSubmitPost[Operate on item level bid options]"             "audienceInsightsGet[Get audience insights]" \
            "audienceInsightsScopeAndTypeGet[Get audience insights scope and type]"             "adAccountsAudiencesSharedAccountsList[List accounts with access to an audience owned by an ad account]" \
            "businessAccountAudiencesSharedAccountsList[List accounts with access to an audience owned by a business]" \
            "sharedAudiencesForBusinessList[List received audiences for a business]" \
            "updateAdAccountToAdAccountSharedAudience[Update audience sharing between ad accounts]" \
            "updateAdAccountToBusinessSharedAudience[Update audience sharing from an ad account to businesses]" \
            "updateBusinessToAdAccountSharedAudience[Update audience sharing from a business to ad accounts]" \
            "updateBusinessToBusinessSharedAudience[Update audience sharing between businesses]"             "audiencesCreate[Create audience]" \
            "audiencesCreateCustom[Create custom audience]" \
            "audiencesGet[Get audience]" \
            "audiencesList[List audiences]" \
            "audiencesUpdate[Update audience]"             "adsCreditRedeem[Redeem ad credits]" \
            "adsCreditsDiscountsGet[Get ads credit discounts]" \
            "billingProfilesGet[Get billing profiles]" \
            "ssioAccountsGet[Get Salesforce account details including bill-to information.]" \
            "ssioInsertionOrderCreate[Create insertion order through SSIO.]" \
            "ssioInsertionOrderEdit[Edit insertion order through SSIO.]" \
            "ssioInsertionOrdersStatusGetByAdAccount[Get insertion order status by ad account id.]" \
            "ssioInsertionOrdersStatusGetByPinOrderId[Get insertion order status by pin order id.]" \
            "ssioOrderLinesGetByAdAccount[Get Salesforce order lines by ad account id.]"             "boardSectionsCreate[Create board section]" \
            "boardSectionsDelete[Delete board section]" \
            "boardSectionsList[List board sections]" \
            "boardSectionsListPins[List Pins on board section]" \
            "boardSectionsUpdate[Update board section]" \
            "boardsCreate[Create board]" \
            "boardsDelete[Delete board]" \
            "boardsGet[Get board]" \
            "boardsList[List boards]" \
            "boardsListPins[List Pins on board]" \
            "boardsUpdate[Update board]"             "bulkDownloadCreate[Get advertiser entities in bulk]" \
            "bulkRequestGet[Download advertiser entities in bulk]" \
            "bulkUpsertCreate[Create/update ad entities in bulk]"             "assetGroupCreate[Create a new asset group.]" \
            "assetGroupDelete[Delete asset groups.]" \
            "assetGroupUpdate[Update asset groups.]" \
            "businessAssetMembersGet[Get members with access to asset]" \
            "businessAssetPartnersGet[Get partners with access to asset]" \
            "businessAssetsGet[List business assets]" \
            "businessMemberAssetsGet[Get assets assigned to a member]" \
            "businessMembersAssetAccessDelete[Delete member access to asset]" \
            "businessMembersAssetAccessUpdate[Assign/Update member asset permissions]" \
            "businessPartnerAssetAccessGet[Get assets assigned to a partner or assets assigned by a partner]" \
            "deletePartnerAssetAccessHandlerImpl[Delete partner access to asset]" \
            "updatePartnerAssetAccessHandlerImpl[Assign/Update partner asset permissions]"             "assetAccessRequestsCreate[Create a request to access an existing partner's assets.]" \
            "cancelInvitesOrRequests[Cancel invites/requests]" \
            "createAssetInvites[Update invite/request with an asset permission]" \
            "createMembershipOrPartnershipInvites[Create invites or requests]" \
            "getInvites[Get invites/requests]" \
            "respondBusinessAccessInvites[Accept or decline an invite/request]"             "deleteBusinessMembership[Terminate business memberships]" \
            "deleteBusinessPartners[Terminate business partnerships]" \
            "getBusinessEmployers[List business employers for user]" \
            "getBusinessMembers[Get business members]" \
            "getBusinessPartners[Get business partners]" \
            "updateBusinessMemberships[Update member's business role]"             "campaignTargetingAnalyticsGet[Get targeting analytics for campaigns]" \
            "campaignsAnalytics[Get campaign analytics]" \
            "campaignsCreate[Create campaigns]" \
            "campaignsGet[Get campaign]" \
            "campaignsList[List campaigns]" \
            "campaignsUpdate[Update campaigns]"             "catalogsCreate[Create catalog]" \
            "catalogsList[List catalogs]" \
            "catalogsProductGroupPinsList[List products by product group]" \
            "catalogsProductGroupsCreate[Create product group]" \
            "catalogsProductGroupsCreateMany[Create product groups]" \
            "catalogsProductGroupsDelete[Delete product group]" \
            "catalogsProductGroupsDeleteMany[Delete product groups]" \
            "catalogsProductGroupsGet[Get product group]" \
            "catalogsProductGroupsList[List product groups]" \
            "catalogsProductGroupsProductCountsGet[Get product counts]" \
            "catalogsProductGroupsUpdate[Update single product group]" \
            "feedProcessingResultsList[List feed processing results]" \
            "feedsCreate[Create feed]" \
            "feedsDelete[Delete feed]" \
            "feedsGet[Get feed]" \
            "feedsIngest[Ingest feed items]" \
            "feedsList[List feeds]" \
            "feedsUpdate[Update feed]" \
            "itemsBatchGet[Get item batch status]" \
            "itemsBatchPost[Operate on item batch]" \
            "itemsGet[Get catalogs items]" \
            "itemsIssuesList[List item issues]" \
            "itemsPost[Get catalogs items (POST)]" \
            "productsByProductGroupFilterList[List products by filter]" \
            "reportsCreate[Build catalogs report]" \
            "reportsGet[Get catalogs report]" \
            "reportsStats[List report stats]"             "eventsCreate[Send conversions]"             "conversionTagsCreate[Create conversion tag]" \
            "conversionTagsGet[Get conversion tag]" \
            "conversionTagsList[Get conversion tags]" \
            "ocpmEligibleConversionTagsGet[Get Ocpm eligible conversion tags]" \
            "pageVisitConversionTagsGet[Get page visit conversion tags]"             "customerListsCreate[Create customer lists]" \
            "customerListsGet[Get customer list]" \
            "customerListsList[Get customer lists]" \
            "customerListsUpdate[Update customer list]"             "integrationsCommerceDel[Delete commerce integration]" \
            "integrationsCommerceGet[Get commerce integration]" \
            "integrationsCommercePatch[Update commerce integration]" \
            "integrationsCommercePost[Create commerce integration]" \
            "integrationsGetById[Get integration metadata]" \
            "integrationsGetList[Get integration metadata list]" \
            "integrationsLogsPost[Receives batched logs from integration applications.]"             "countryKeywordsMetricsGet[Get country's keyword metrics]" \
            "keywordsCreate[Create keywords]" \
            "keywordsGet[Get keywords]" \
            "keywordsUpdate[Update keywords]" \
            "trendingKeywordsList[List trending keywords]"             "adAccountsSubscriptionsDelById[Delete lead ads subscription]" \
            "adAccountsSubscriptionsGetById[Get lead ads subscription]" \
            "adAccountsSubscriptionsGetList[Get lead ads subscriptions]" \
            "adAccountsSubscriptionsPost[Create lead ads subscription]"             "leadFormGet[Get lead form by id]" \
            "leadFormTestCreate[Create lead form test data]" \
            "leadFormsCreate[Create lead forms]" \
            "leadFormsList[List lead forms]" \
            "leadFormsUpdate[Update lead forms]"             "leadsExportCreate[Create a request to export leads collected from a lead ad]" \
            "leadsExportGet[Get the lead export from the lead export create call]"             "mediaCreate[Register media upload]" \
            "mediaGet[Get media upload details]" \
            "mediaList[List media uploads]"             "oauthToken[Generate OAuth access token]"             "orderLinesGet[Get order line]" \
            "orderLinesList[Get order lines]"             "multiPinsAnalytics[Get multiple Pin analytics]" \
            "pinsAnalytics[Get Pin analytics]" \
            "pinsCreate[Create Pin]" \
            "pinsDelete[Delete Pin]" \
            "pinsGet[Get Pin]" \
            "pinsList[List Pins]" \
            "pinsSave[Save Pin]" \
            "pinsUpdate[Update Pin]"             "productGroupPromotionsCreate[Create product group promotions]" \
            "productGroupPromotionsGet[Get a product group promotion by id]" \
            "productGroupPromotionsList[Get product group promotions]" \
            "productGroupPromotionsUpdate[Update product group promotions]" \
            "productGroupsAnalytics[Get product group analytics]"             "adAccountCountriesGet[Get ad accounts countries]" \
            "deliveryMetricsGet[Get available metrics' definitions]" \
            "interestTargetingOptionsGet[Get interest details]" \
            "leadFormQuestionsGet[Get lead form questions]" \
            "metricsReadyStateGet[Get metrics ready state]" \
            "targetingOptionsGet[Get targeting options]"             "searchPartnerPins[Search pins by a given search term]" \
            "searchUserBoardsGet[Search user's boards]" \
            "searchUserPinsList[Search user's Pins]"             "targetingTemplateCreate[Create targeting templates]" \
            "targetingTemplateList[List targeting templates]" \
            "targetingTemplateUpdate[Update targeting templates]"             "termsRelatedList[List related terms]" \
            "termsSuggestedList[List suggested terms]"             "termsOfServiceGet[Get terms of service]"             "boardsUserFollowsList[List following boards]" \
            "followUserUpdate[Follow user]" \
            "followersList[List followers]" \
            "linkedBusinessAccountsGet[List linked businesses]" \
            "unverifyWebsiteDelete[Unverify website]" \
            "userAccountAnalytics[Get user account analytics]" \
            "userAccountAnalyticsTopPins[Get user account top pins analytics]" \
            "userAccountAnalyticsTopVideoPins[Get user account top video pins analytics]" \
            "userAccountFollowedInterests[List following interests]" \
            "userAccountGet[Get user account]" \
            "userFollowingGet[List following]" \
            "userWebsitesGet[Get user websites]" \
            "verifyWebsiteUpdate[Verify website]" \
            "websiteVerificationGet[Get user verification code for website claiming]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      adAccountAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountTargetingAnalyticsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"targeting_types=:[QUERY] Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
"attribution_types=:[QUERY] List of types of attribution for the conversion report"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsCreate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"include_shared_accounts=true:[QUERY] Include shared ad accounts"
          "include_shared_accounts=false:[QUERY] Include shared ad accounts"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      analyticsCreateMmmReport)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
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
      analyticsCreateTemplateReport)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"template_id=:[PATH] Unique identifier of a template."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date."
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      analyticsGetMmmReport)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "token=:[QUERY] Token returned from the post request creation call"
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
      sandboxDelete)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"ad_group_ids=:[QUERY] List of Ad group Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsAudienceSizing)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsBidFloorGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"ad_group_id=:[PATH] Unique identifier of an ad group."
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
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"translate_interests_to_names=true:[QUERY] Return interests as text names (if value is true) rather than topic IDs."
          "translate_interests_to_names=false:[QUERY] Return interests as text names (if value is true) rather than topic IDs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsTargetingAnalyticsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "ad_group_ids=:[QUERY] List of Ad group Ids to use to filter the results."
"start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"targeting_types=:[QUERY] Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
"attribution_types=:[QUERY] List of types of attribution for the conversion report"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adGroupsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adPreviewsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adTargetingAnalyticsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "ad_ids=:[QUERY] List of Ad Ids to use to filter the results."
"start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"targeting_types=:[QUERY] Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
"attribution_types=:[QUERY] List of types of attribution for the conversion report"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"ad_ids=:[QUERY] List of Ad Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
"pin_ids=:[QUERY] List of Pin IDs."
"campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"ad_id=:[PATH] Unique identifier of an ad."
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
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      advancedAuctionItemsGetPost)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      advancedAuctionItemsSubmitPost)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audienceInsightsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "audience_insight_type=:[QUERY] Type of audience insights."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audienceInsightsScopeAndTypeGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsAudiencesSharedAccountsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "audience_id=:[QUERY] Unique identifier of the audience to use to filter the results."
"account_type=:[QUERY] Filter accounts by account type."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessAccountAudiencesSharedAccountsList)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "audience_id=:[QUERY] Unique identifier of the audience to use to filter the results."
"account_type=:[QUERY] Filter accounts by account type."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      sharedAudiencesForBusinessList)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateAdAccountToAdAccountSharedAudience)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateAdAccountToBusinessSharedAudience)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessToAdAccountSharedAudience)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessToBusinessSharedAudience)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audiencesCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audiencesCreateCustom)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audiencesGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"audience_id=:[PATH] Unique identifier of an audience"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audiencesList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID.
For received audiences, it is sorted by sharing event time.
Note that higher-value IDs are associated with more-recently added items."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ownership_type=:[QUERY] Filter audiences by ownership type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      audiencesUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"audience_id=:[PATH] Unique identifier of an audience"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsCreditRedeem)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adsCreditsDiscountsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      billingProfilesGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "is_active=true:[QUERY] Return active billing profiles, if false return all billing profiles."
          "is_active=false:[QUERY] Return active billing profiles, if false return all billing profiles."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioAccountsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioInsertionOrderCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioInsertionOrderEdit)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioInsertionOrdersStatusGetByAdAccount)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioInsertionOrdersStatusGetByPinOrderId)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"pin_order_id=:[PATH] The pin order id associated with the ssio insertion order"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ssioOrderLinesGetByAdAccount)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"pin_order_id=:[QUERY] The pin order id associated with the ssio insertino order"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsCreate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsDelete)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsList)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsListPins)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardSectionsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
"section_id=:[PATH] Unique identifier of a board section."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsDelete)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsGet)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsList)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"privacy=:[QUERY] Privacy setting for a board."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsListPins)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"creative_types=:[QUERY] Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
"pin_metrics=true:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          "pin_metrics=false:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "board_id=:[PATH] Unique identifier of a board."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      bulkDownloadCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      bulkRequestGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"bulk_request_id=:[PATH] Unique identifier of a bulk upsert request."
          "include_details=true:[QUERY] if set to True then attach the errors/details to all the requests"
          "include_details=false:[QUERY] if set to True then attach the errors/details to all the requests"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      bulkUpsertCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetGroupCreate)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetGroupDelete)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetGroupUpdate)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessAssetMembersGet)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
"asset_id=:[PATH] Unique identifier of a business asset."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessAssetPartnersGet)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
"asset_id=:[PATH] Unique identifier of a business asset."
          "start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessAssetsGet)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "permissions=:[QUERY] A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned."
"child_asset_id=:[QUERY] A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child."
"asset_group_id=:[QUERY] An asset group unique identifier. Used to fetch assets contained within the specified asset group."
"asset_type=:[QUERY] A resource type to filter the assets by. Only assets of the specified type will be returned."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessMemberAssetsGet)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
"member_id=:[PATH] The member id to fetch assets for."
          "asset_type=:[QUERY] A resource type to filter the assets by. Only assets of the specified type will be returned."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessMembersAssetAccessDelete)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessMembersAssetAccessUpdate)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      businessPartnerAssetAccessGet)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
"partner_id=:[PATH] The partner id to be bound to the Business"
          "partner_type=:[QUERY] Specifies whether to fetch internal or external (shared) partners.
If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt;
If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset."
"asset_type=:[QUERY] A resource type to filter the assets by. Only assets of the specified type will be returned."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deletePartnerAssetAccessHandlerImpl)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updatePartnerAssetAccessHandlerImpl)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetAccessRequestsCreate)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      cancelInvitesOrRequests)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Business id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createAssetInvites)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      createMembershipOrPartnershipInvites)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Business id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getInvites)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "is_member=true:[QUERY] A boolean field to indicate whether the invite is to create a partnership or a membership."
          "is_member=false:[QUERY] A boolean field to indicate whether the invite is to create a partnership or a membership."
"invite_status=:[QUERY] A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned."
"invite_type=:[QUERY] Invite type to filter invites by. Only invites of the specified type will be returned."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      respondBusinessAccessInvites)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteBusinessMembership)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Business id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deleteBusinessPartners)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessEmployers)
        local -a _op_arguments
        _op_arguments=(
                    "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessMembers)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "assets_summary=true:[QUERY] Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are"
          "assets_summary=false:[QUERY] Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are"
"business_roles=:[QUERY] A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned."
"member_ids=:[QUERY] A list of business members ids separated by comma."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getBusinessPartners)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Unique identifier of the requesting business."
          "assets_summary=true:[QUERY] Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are"
          "assets_summary=false:[QUERY] Include assets summary in the response if this is true.

The assets summary returns a dictionary representing a summary of the assets
for the business user ID, with information like the ad accounts and profiles
the user has permissions for and what those permissions are"
"partner_type=:[QUERY] Specifies whether to fetch internal or external (shared) partners.
If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt;
If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset."
"partner_ids=:[QUERY] A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned."
"start_index=:[QUERY] An index to start fetching the results from. Only the results starting from this index will be returned."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateBusinessMemberships)
        local -a _op_arguments
        _op_arguments=(
          "business_id=:[PATH] Business id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignTargetingAnalyticsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"targeting_types=:[QUERY] Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
"attribution_types=:[QUERY] List of types of attribution for the conversion report"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"campaign_id=:[PATH] Campaign ID, must be associated with the ad account ID provided in the path."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_ids=:[QUERY] List of Campaign Ids to use to filter the results."
"entity_statuses=:[QUERY] Entity status"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      campaignsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupPinsList)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
"pin_metrics=true:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          "pin_metrics=false:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsCreateMany)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsDelete)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsDeleteMany)
        local -a _op_arguments
        _op_arguments=(
                    "id=:[QUERY] Comma-separated list of product group ids"
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsGet)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsList)
        local -a _op_arguments
        _op_arguments=(
                    "id=:[QUERY] Comma-separated list of product group ids"
"feed_id=:[QUERY] Filter entities for a given feed_id. If not given, all feeds are considered."
"catalog_id=:[QUERY] Filter entities for a given catalog_id. If not given, all catalogs are considered."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsProductCountsGet)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      catalogsProductGroupsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "product_group_id=:[PATH] Unique identifier of a product group"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedProcessingResultsList)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsDelete)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsGet)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsIngest)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"catalog_id=:[QUERY] Filter entities for a given catalog_id. If not given, all catalogs are considered."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      feedsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "feed_id=:[PATH] Unique identifier of a feed"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsBatchGet)
        local -a _op_arguments
        _op_arguments=(
          "batch_id=:[PATH] Id of a catalogs items batch to fetch"
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsBatchPost)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsGet)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"country=:[QUERY] Country for the Catalogs Items"
"language=:[QUERY] Language for the Catalogs Items"
"item_ids=:[QUERY] This parameter is deprecated. Use filters instead."
"filters=:[QUERY] Identifies items to be retrieved. This is a required parameter."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsIssuesList)
        local -a _op_arguments
        _op_arguments=(
          "processing_result_id=:[PATH] Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list)."
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"item_numbers=:[QUERY] Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation."
"item_validation_issue=:[QUERY] Filter item validation issues that have a given type of item validation issue."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      itemsPost)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productsByProductGroupFilterList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
"pin_metrics=true:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          "pin_metrics=false:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsGet)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"token=:[QUERY] Token returned from async build report call"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsStats)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"parameters=:[QUERY] Contains the parameters for report identification."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      eventsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "test=true:[QUERY] Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly.
Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request."
          "test=false:[QUERY] Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly.
Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      conversionTagsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      conversionTagsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"conversion_tag_id=:[PATH] Id of the conversion tag."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      conversionTagsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "filter_deleted=true:[QUERY] Filter out deleted tags."
          "filter_deleted=false:[QUERY] Filter out deleted tags."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ocpmEligibleConversionTagsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pageVisitConversionTagsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      customerListsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      customerListsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"customer_list_id=:[PATH] Unique identifier of a customer list"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      customerListsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      customerListsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"customer_list_id=:[PATH] Unique identifier of a customer list"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsCommerceDel)
        local -a _op_arguments
        _op_arguments=(
          "external_business_id=:[PATH] External business ID for the integration."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsCommerceGet)
        local -a _op_arguments
        _op_arguments=(
          "external_business_id=:[PATH] External business ID for the integration."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsCommercePatch)
        local -a _op_arguments
        _op_arguments=(
          "external_business_id=:[PATH] External business ID for the integration."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsCommercePost)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsGetById)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] Integration ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsGetList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      integrationsLogsPost)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      countryKeywordsMetricsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "country_code=:[QUERY] Two letter country code (ISO 3166-1 alpha-2)"
"keywords=:[QUERY] Comma-separated keywords"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      keywordsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      keywordsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "campaign_id=:[QUERY] Campaign Id to use to filter the results."
"ad_group_id=:[QUERY] Ad group Id."
"match_types=:[QUERY] Keyword &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot;&gt;match type&lt;/a&gt;"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      keywordsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      trendingKeywordsList)
        local -a _op_arguments
        _op_arguments=(
          "region=:[PATH] The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt;
The &#39;region&#39; parameter is formatted as ISO 3166-2 country codes delimited by &#39;+&#39;, corresponding to the following geographic areas:
- &#39;US&#39; - United States
- &#39;CA&#39; - Canada
- &#39;DE&#39; - Germany
- &#39;FR&#39; - France
- &#39;ES&#39; - Spain
- &#39;IT&#39; - Italy
- &#39;DE+AT+CH&#39; - Germanic countries
- &#39;GB+IE&#39; - Great Britain &amp; Ireland
- &#39;IT+ES+PT+GR+MT&#39; - Southern Europe
- &#39;PL+RO+HU+SK+CZ&#39; - Eastern Europe
- &#39;SE+DK+FI+NO&#39; - Nordic countries
- &#39;NL+BE+LU&#39; - Benelux
- &#39;AR&#39; - Argentina
- &#39;BR&#39; - Brazil
- &#39;CO&#39; - Colombia
- &#39;MX&#39; - Mexico
- &#39;MX+AR+CO+CL&#39; - Hispanic LatAm
- &#39;AU+NZ&#39; - Australasia"
"trend_type=:[PATH] The methodology used to rank how trendy a keyword is.
- &#39;growing&#39; trends have high upward growth in search volume over the last quarter
- &#39;monthly&#39; trends have high search volume in the last month
- &#39;yearly&#39; trends have high search volume in the last year
- &#39;seasonal&#39; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)"
          "interests=:[QUERY] If set, filters the results to trends associated with the specified interests.&lt;br /&gt;
If unset, trends for all interests will be returned.&lt;br /&gt;
The list of supported interests is:
- &#39;animals&#39; - Animals
- &#39;architecture&#39; - Architecture
- &#39;art&#39; - Art
- &#39;beauty&#39; - Beauty
- &#39;childrens_fashion&#39; - Children&#39;s Fashion
- &#39;design&#39; - Design
- &#39;diy_and_crafts&#39; - DIY &amp; Crafts
- &#39;education&#39; - Education
- &#39;electronics&#39; - Electronics
- &#39;entertainment&#39; - Entertainment
- &#39;event_planning&#39; - Event Planning
- &#39;finance&#39; - Finance
- &#39;food_and_drinks&#39; - Food &amp; Drink
- &#39;gardening&#39; - Gardening
- &#39;health&#39; - Health
- &#39;home_decor&#39; - Home Decor
- &#39;mens_fashion&#39; - Men&#39;s Fashion
- &#39;parenting&#39; - Parenting
- &#39;quotes&#39; - Quotes
- &#39;sport&#39; - Sports
- &#39;travel&#39; - Travel
- &#39;vehicles&#39; - Vehicles
- &#39;wedding&#39; - Wedding
- &#39;womens_fashion&#39; - Women&#39;s Fashion"
"genders=:[QUERY] If set, filters the results to trends among users who identify with the specified gender(s).&lt;br /&gt;
If unset, trends among all genders will be returned.&lt;br /&gt;
The &#39;unknown&#39; group includes users with unspecified or customized gender profile settings."
"ages=:[QUERY] If set, filters the results to trends among users in the specified age range(s).&lt;br /&gt;
If unset, trends among all age groups will be returned."
"include_keywords=:[QUERY] If set, filters the results to top trends which include at least one of the specified keywords.&lt;br /&gt;
If unset, no keyword filtering logic is applied."
"normalize_against_group=true:[QUERY] Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt;
By default (&#39;false&#39;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt;
If set to &#39;true&#39;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords."
          "normalize_against_group=false:[QUERY] Governs how the resulting time series data will be normalized to a [0-100] scale.&lt;br /&gt;
By default (&#39;false&#39;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.&lt;br /&gt;
If set to &#39;true&#39;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords."
"limit=:[QUERY] The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#39;limit&#39; of 50 will return the top 50 trends."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsSubscriptionsDelById)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"subscription_id=:[PATH] Unique identifier of a subscription."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsSubscriptionsGetById)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"subscription_id=:[PATH] Unique identifier of a subscription."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsSubscriptionsGetList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountsSubscriptionsPost)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"lead_form_id=:[PATH] Unique identifier of a lead form."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormTestCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"lead_form_id=:[PATH] Unique identifier of a lead form."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadsExportCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadsExportGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"leads_export_id=:[PATH] lead_export_id token returned from the create a lead export endpoint"
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
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      oauthToken)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orderLinesGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"order_line_id=:[PATH] Unique identifier of an order line."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      orderLinesList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      multiPinsAnalytics)
        local -a _op_arguments
        _op_arguments=(
                    "pin_ids=:[QUERY] List of Pin IDs."
"start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"metric_types=:[QUERY] Pin metric types to get data for."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"metric_types=:[QUERY] Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;."
"split_field=:[QUERY] How to split the data into groups. Not including this param means data won&#39;t be split."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsCreate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsDelete)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsGet)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "pin_metrics=true:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          "pin_metrics=false:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"pin_filter=:[QUERY] Pin filter."
"include_protected_pins=true:[QUERY] Specify if return pins from protected boards"
          "include_protected_pins=false:[QUERY] Specify if return pins from protected boards"
"pin_type=:[QUERY] The type of pins to return, currently only enabled for private pins"
"creative_types=:[QUERY] Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
"pin_metrics=true:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          "pin_metrics=false:[QUERY] Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsSave)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pinsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "pin_id=:[PATH] Unique identifier of a Pin."
          "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupPromotionsCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupPromotionsGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
"product_group_promotion_id=:[PATH] Unique identifier of a product group promotion"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupPromotionsList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "product_group_promotion_ids=:[QUERY] List of Product group promotion Ids."
"entity_statuses=:[QUERY] Entity status"
"ad_group_id=:[QUERY] Ad group Id."
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupPromotionsUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      productGroupsAnalytics)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"product_group_ids=:[QUERY] List of Product group Ids to use to filter the results."
"columns=:[QUERY] Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned"
"granularity=:[QUERY] TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly"
"click_window_days=:[QUERY] Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"engagement_window_days=:[QUERY] Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;30&#39; days."
"view_window_days=:[QUERY] Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#39;1&#39; day."
"conversion_report_time=:[QUERY] The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      adAccountCountriesGet)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      deliveryMetricsGet)
        local -a _op_arguments
        _op_arguments=(
                    "report_type=:[QUERY] Report type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      interestTargetingOptionsGet)
        local -a _op_arguments
        _op_arguments=(
          "interest_id=:[PATH] Unique identifier of an interest."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      leadFormQuestionsGet)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      metricsReadyStateGet)
        local -a _op_arguments
        _op_arguments=(
                    "date=:[QUERY] Analytics reports request date (UTC). Format: YYYY-MM-DD"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      targetingOptionsGet)
        local -a _op_arguments
        _op_arguments=(
          "targeting_type=:[PATH] Public targeting type."
          "client_id=:[QUERY] Client ID."
"oauth_signature=:[QUERY] Oauth signature"
"timestamp=:[QUERY] Timestamp"
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchPartnerPins)
        local -a _op_arguments
        _op_arguments=(
                    "term=:[QUERY] Search term to look up pins."
"country_code=:[QUERY] Two letter country code (ISO 3166-1 alpha-2)"
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"locale=:[QUERY] Search locale."
"limit=:[QUERY] Max search result size"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchUserBoardsGet)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"query=:[QUERY] Search query. Can contain pin description keywords or comma-separated pin IDs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      searchUserPinsList)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
"query=:[QUERY] Search query. Can contain pin description keywords or comma-separated pin IDs."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      targetingTemplateCreate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      targetingTemplateList)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "order=:[QUERY] The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items."
"include_sizing=true:[QUERY] Include audience sizing in result or not"
          "include_sizing=false:[QUERY] Include audience sizing in result or not"
"search_query=:[QUERY] Search keyword for targeting templates"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"bookmark=:[QUERY] Cursor used to fetch the next page of items"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      targetingTemplateUpdate)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      termsRelatedList)
        local -a _op_arguments
        _op_arguments=(
                    "terms=:[QUERY] List of input terms."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      termsSuggestedList)
        local -a _op_arguments
        _op_arguments=(
                    "term=:[QUERY] Input term."
"limit=:[QUERY] Max suggested terms to return."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      termsOfServiceGet)
        local -a _op_arguments
        _op_arguments=(
          "ad_account_id=:[PATH] Unique identifier of an ad account."
          "include_html=true:[QUERY] Return HTML in TOS text."
          "include_html=false:[QUERY] Return HTML in TOS text."
"tos_type=:[QUERY] Request type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      boardsUserFollowsList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"explicit_following=true:[QUERY] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows."
          "explicit_following=false:[QUERY] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      followUserUpdate)
        local -a _op_arguments
        _op_arguments=(
          "username=:[PATH] A valid username"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      followersList)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      linkedBusinessAccountsGet)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      unverifyWebsiteDelete)
        local -a _op_arguments
        _op_arguments=(
                    "website=:[QUERY] Website with path or domain only"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountAnalytics)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"from_claimed_content=:[QUERY] Filter on Pins that match your claimed domain."
"pin_format=:[QUERY] Pin formats to get data for, default is all."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"content_type=:[QUERY] Filter to paid or organic data. Default is all."
"source=:[QUERY] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts"
"metric_types=:[QUERY] Metric types to get data for, default is all."
"split_field=:[QUERY] How to split the data into groups. Not including this param means data won&#39;t be split."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountAnalyticsTopPins)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"sort_by=:[QUERY] Specify sorting order for metrics"
"from_claimed_content=:[QUERY] Filter on Pins that match your claimed domain."
"pin_format=:[QUERY] Pin formats to get data for, default is all."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"content_type=:[QUERY] Filter to paid or organic data. Default is all."
"source=:[QUERY] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts"
"metric_types=:[QUERY] Metric types to get data for, default is all."
"num_of_pins=:[QUERY] Number of pins to include, default is 10. Max is 50."
"created_in_last_n_days=:[QUERY] Get metrics for pins created in the last \&quot;n\&quot; days."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountAnalyticsTopVideoPins)
        local -a _op_arguments
        _op_arguments=(
                    "start_date=:[QUERY] Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today."
"end_date=:[QUERY] Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date."
"sort_by=:[QUERY] Specify sorting order for video metrics"
"from_claimed_content=:[QUERY] Filter on Pins that match your claimed domain."
"pin_format=:[QUERY] Pin formats to get data for, default is all."
"app_types=:[QUERY] Apps or devices to get data for, default is all."
"content_type=:[QUERY] Filter to paid or organic data. Default is all."
"source=:[QUERY] Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts"
"metric_types=:[QUERY] Metric types to get video data for, default is all."
"num_of_pins=:[QUERY] Number of pins to include, default is 10. Max is 50."
"created_in_last_n_days=:[QUERY] Get metrics for pins created in the last \&quot;n\&quot; days."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userAccountFollowedInterests)
        local -a _op_arguments
        _op_arguments=(
          "username=:[PATH] A valid username"
          "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
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
      userFollowingGet)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
"feed_type=:[QUERY] Thrift param specifying what type of followees will be kept. Default to include all followees."
"explicit_following=true:[QUERY] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows."
          "explicit_following=false:[QUERY] Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows."
"ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      userWebsitesGet)
        local -a _op_arguments
        _op_arguments=(
                    "bookmark=:[QUERY] Cursor used to fetch the next page of items"
"page_size=:[QUERY] Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      verifyWebsiteUpdate)
        local -a _op_arguments
        _op_arguments=(
                    "ad_account_id=:[QUERY] Unique identifier of an ad account."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      websiteVerificationGet)
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
