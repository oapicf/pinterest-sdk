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

use_ok('WWW::OpenAPIClient::IntegrationsApi');

my $api = WWW::OpenAPIClient::IntegrationsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::IntegrationsApi');

#
# integrations_commerce_del test
#
# uncomment below and update the test
#my $integrations_commerce_del_external_business_id = undef; # replace NULL with a proper value
#my $integrations_commerce_del_result = $api->integrations_commerce_del(external_business_id => $integrations_commerce_del_external_business_id);

#
# integrations_commerce_get test
#
# uncomment below and update the test
#my $integrations_commerce_get_external_business_id = undef; # replace NULL with a proper value
#my $integrations_commerce_get_result = $api->integrations_commerce_get(external_business_id => $integrations_commerce_get_external_business_id);

#
# integrations_commerce_patch test
#
# uncomment below and update the test
#my $integrations_commerce_patch_external_business_id = undef; # replace NULL with a proper value
#my $integrations_commerce_patch_integration_request_patch = undef; # replace NULL with a proper value
#my $integrations_commerce_patch_result = $api->integrations_commerce_patch(external_business_id => $integrations_commerce_patch_external_business_id, integration_request_patch => $integrations_commerce_patch_integration_request_patch);

#
# integrations_commerce_post test
#
# uncomment below and update the test
#my $integrations_commerce_post_integration_request = undef; # replace NULL with a proper value
#my $integrations_commerce_post_result = $api->integrations_commerce_post(integration_request => $integrations_commerce_post_integration_request);

#
# integrations_get_by_id test
#
# uncomment below and update the test
#my $integrations_get_by_id_id = undef; # replace NULL with a proper value
#my $integrations_get_by_id_result = $api->integrations_get_by_id(id => $integrations_get_by_id_id);

#
# integrations_get_list test
#
# uncomment below and update the test
#my $integrations_get_list_bookmark = undef; # replace NULL with a proper value
#my $integrations_get_list_page_size = undef; # replace NULL with a proper value
#my $integrations_get_list_result = $api->integrations_get_list(bookmark => $integrations_get_list_bookmark, page_size => $integrations_get_list_page_size);

#
# integrations_logs_post test
#
# uncomment below and update the test
#my $integrations_logs_post_integration_logs_request = undef; # replace NULL with a proper value
#my $integrations_logs_post_result = $api->integrations_logs_post(integration_logs_request => $integrations_logs_post_integration_logs_request);


done_testing();
