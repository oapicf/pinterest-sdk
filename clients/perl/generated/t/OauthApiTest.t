=begin comment

Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::OauthApi');

my $api = WWW::OpenAPIClient::OauthApi->new();
isa_ok($api, 'WWW::OpenAPIClient::OauthApi');

#
# oauth_token test
#
# uncomment below and update the test
#my $oauth_token_grant_type = undef; # replace NULL with a proper value
#my $oauth_token_result = $api->oauth_token(grant_type => $oauth_token_grant_type);


done_testing();
