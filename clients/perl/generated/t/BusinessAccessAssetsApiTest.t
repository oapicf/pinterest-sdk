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

use_ok('WWW::OpenAPIClient::BusinessAccessAssetsApi');

my $api = WWW::OpenAPIClient::BusinessAccessAssetsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::BusinessAccessAssetsApi');

#
# asset_group_create test
#
# uncomment below and update the test
#my $asset_group_create_business_id = undef; # replace NULL with a proper value
#my $asset_group_create_create_asset_group_body = undef; # replace NULL with a proper value
#my $asset_group_create_result = $api->asset_group_create(business_id => $asset_group_create_business_id, create_asset_group_body => $asset_group_create_create_asset_group_body);

#
# asset_group_delete test
#
# uncomment below and update the test
#my $asset_group_delete_business_id = undef; # replace NULL with a proper value
#my $asset_group_delete_delete_asset_group_body = undef; # replace NULL with a proper value
#my $asset_group_delete_result = $api->asset_group_delete(business_id => $asset_group_delete_business_id, delete_asset_group_body => $asset_group_delete_delete_asset_group_body);

#
# asset_group_update test
#
# uncomment below and update the test
#my $asset_group_update_business_id = undef; # replace NULL with a proper value
#my $asset_group_update_update_asset_group_body = undef; # replace NULL with a proper value
#my $asset_group_update_result = $api->asset_group_update(business_id => $asset_group_update_business_id, update_asset_group_body => $asset_group_update_update_asset_group_body);

#
# business_asset_members_get test
#
# uncomment below and update the test
#my $business_asset_members_get_business_id = undef; # replace NULL with a proper value
#my $business_asset_members_get_asset_id = undef; # replace NULL with a proper value
#my $business_asset_members_get_bookmark = undef; # replace NULL with a proper value
#my $business_asset_members_get_page_size = undef; # replace NULL with a proper value
#my $business_asset_members_get_start_index = undef; # replace NULL with a proper value
#my $business_asset_members_get_result = $api->business_asset_members_get(business_id => $business_asset_members_get_business_id, asset_id => $business_asset_members_get_asset_id, bookmark => $business_asset_members_get_bookmark, page_size => $business_asset_members_get_page_size, start_index => $business_asset_members_get_start_index);

#
# business_asset_partners_get test
#
# uncomment below and update the test
#my $business_asset_partners_get_business_id = undef; # replace NULL with a proper value
#my $business_asset_partners_get_asset_id = undef; # replace NULL with a proper value
#my $business_asset_partners_get_start_index = undef; # replace NULL with a proper value
#my $business_asset_partners_get_bookmark = undef; # replace NULL with a proper value
#my $business_asset_partners_get_page_size = undef; # replace NULL with a proper value
#my $business_asset_partners_get_result = $api->business_asset_partners_get(business_id => $business_asset_partners_get_business_id, asset_id => $business_asset_partners_get_asset_id, start_index => $business_asset_partners_get_start_index, bookmark => $business_asset_partners_get_bookmark, page_size => $business_asset_partners_get_page_size);

#
# business_assets_get test
#
# uncomment below and update the test
#my $business_assets_get_business_id = undef; # replace NULL with a proper value
#my $business_assets_get_permissions = undef; # replace NULL with a proper value
#my $business_assets_get_child_asset_id = undef; # replace NULL with a proper value
#my $business_assets_get_asset_group_id = undef; # replace NULL with a proper value
#my $business_assets_get_asset_type = undef; # replace NULL with a proper value
#my $business_assets_get_start_index = undef; # replace NULL with a proper value
#my $business_assets_get_bookmark = undef; # replace NULL with a proper value
#my $business_assets_get_page_size = undef; # replace NULL with a proper value
#my $business_assets_get_result = $api->business_assets_get(business_id => $business_assets_get_business_id, permissions => $business_assets_get_permissions, child_asset_id => $business_assets_get_child_asset_id, asset_group_id => $business_assets_get_asset_group_id, asset_type => $business_assets_get_asset_type, start_index => $business_assets_get_start_index, bookmark => $business_assets_get_bookmark, page_size => $business_assets_get_page_size);

#
# business_member_assets_get test
#
# uncomment below and update the test
#my $business_member_assets_get_business_id = undef; # replace NULL with a proper value
#my $business_member_assets_get_member_id = undef; # replace NULL with a proper value
#my $business_member_assets_get_asset_type = undef; # replace NULL with a proper value
#my $business_member_assets_get_start_index = undef; # replace NULL with a proper value
#my $business_member_assets_get_bookmark = undef; # replace NULL with a proper value
#my $business_member_assets_get_page_size = undef; # replace NULL with a proper value
#my $business_member_assets_get_result = $api->business_member_assets_get(business_id => $business_member_assets_get_business_id, member_id => $business_member_assets_get_member_id, asset_type => $business_member_assets_get_asset_type, start_index => $business_member_assets_get_start_index, bookmark => $business_member_assets_get_bookmark, page_size => $business_member_assets_get_page_size);

#
# business_members_asset_access_delete test
#
# uncomment below and update the test
#my $business_members_asset_access_delete_business_id = undef; # replace NULL with a proper value
#my $business_members_asset_access_delete_business_members_asset_access_delete_request = undef; # replace NULL with a proper value
#my $business_members_asset_access_delete_result = $api->business_members_asset_access_delete(business_id => $business_members_asset_access_delete_business_id, business_members_asset_access_delete_request => $business_members_asset_access_delete_business_members_asset_access_delete_request);

#
# business_members_asset_access_update test
#
# uncomment below and update the test
#my $business_members_asset_access_update_business_id = undef; # replace NULL with a proper value
#my $business_members_asset_access_update_update_member_asset_access_body = undef; # replace NULL with a proper value
#my $business_members_asset_access_update_result = $api->business_members_asset_access_update(business_id => $business_members_asset_access_update_business_id, update_member_asset_access_body => $business_members_asset_access_update_update_member_asset_access_body);

#
# business_partner_asset_access_get test
#
# uncomment below and update the test
#my $business_partner_asset_access_get_business_id = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_partner_id = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_partner_type = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_asset_type = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_start_index = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_page_size = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_bookmark = undef; # replace NULL with a proper value
#my $business_partner_asset_access_get_result = $api->business_partner_asset_access_get(business_id => $business_partner_asset_access_get_business_id, partner_id => $business_partner_asset_access_get_partner_id, partner_type => $business_partner_asset_access_get_partner_type, asset_type => $business_partner_asset_access_get_asset_type, start_index => $business_partner_asset_access_get_start_index, page_size => $business_partner_asset_access_get_page_size, bookmark => $business_partner_asset_access_get_bookmark);

#
# delete_partner_asset_access_handler_impl test
#
# uncomment below and update the test
#my $delete_partner_asset_access_handler_impl_business_id = undef; # replace NULL with a proper value
#my $delete_partner_asset_access_handler_impl_delete_partner_asset_access_body = undef; # replace NULL with a proper value
#my $delete_partner_asset_access_handler_impl_result = $api->delete_partner_asset_access_handler_impl(business_id => $delete_partner_asset_access_handler_impl_business_id, delete_partner_asset_access_body => $delete_partner_asset_access_handler_impl_delete_partner_asset_access_body);

#
# update_partner_asset_access_handler_impl test
#
# uncomment below and update the test
#my $update_partner_asset_access_handler_impl_business_id = undef; # replace NULL with a proper value
#my $update_partner_asset_access_handler_impl_update_partner_asset_access_body = undef; # replace NULL with a proper value
#my $update_partner_asset_access_handler_impl_result = $api->update_partner_asset_access_handler_impl(business_id => $update_partner_asset_access_handler_impl_business_id, update_partner_asset_access_body => $update_partner_asset_access_handler_impl_update_partner_asset_access_body);


done_testing();
