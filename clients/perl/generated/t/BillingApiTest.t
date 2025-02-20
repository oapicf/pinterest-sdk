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

use_ok('WWW::OpenAPIClient::BillingApi');

my $api = WWW::OpenAPIClient::BillingApi->new();
isa_ok($api, 'WWW::OpenAPIClient::BillingApi');

#
# ads_credit_redeem test
#
# uncomment below and update the test
#my $ads_credit_redeem_ad_account_id = undef; # replace NULL with a proper value
#my $ads_credit_redeem_ads_credit_redeem_request = undef; # replace NULL with a proper value
#my $ads_credit_redeem_result = $api->ads_credit_redeem(ad_account_id => $ads_credit_redeem_ad_account_id, ads_credit_redeem_request => $ads_credit_redeem_ads_credit_redeem_request);

#
# ads_credits_discounts_get test
#
# uncomment below and update the test
#my $ads_credits_discounts_get_ad_account_id = undef; # replace NULL with a proper value
#my $ads_credits_discounts_get_bookmark = undef; # replace NULL with a proper value
#my $ads_credits_discounts_get_page_size = undef; # replace NULL with a proper value
#my $ads_credits_discounts_get_result = $api->ads_credits_discounts_get(ad_account_id => $ads_credits_discounts_get_ad_account_id, bookmark => $ads_credits_discounts_get_bookmark, page_size => $ads_credits_discounts_get_page_size);

#
# billing_profiles_get test
#
# uncomment below and update the test
#my $billing_profiles_get_ad_account_id = undef; # replace NULL with a proper value
#my $billing_profiles_get_is_active = undef; # replace NULL with a proper value
#my $billing_profiles_get_bookmark = undef; # replace NULL with a proper value
#my $billing_profiles_get_page_size = undef; # replace NULL with a proper value
#my $billing_profiles_get_result = $api->billing_profiles_get(ad_account_id => $billing_profiles_get_ad_account_id, is_active => $billing_profiles_get_is_active, bookmark => $billing_profiles_get_bookmark, page_size => $billing_profiles_get_page_size);

#
# ssio_accounts_get test
#
# uncomment below and update the test
#my $ssio_accounts_get_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_accounts_get_result = $api->ssio_accounts_get(ad_account_id => $ssio_accounts_get_ad_account_id);

#
# ssio_insertion_order_create test
#
# uncomment below and update the test
#my $ssio_insertion_order_create_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_insertion_order_create_ssio_create_insertion_order_request = undef; # replace NULL with a proper value
#my $ssio_insertion_order_create_result = $api->ssio_insertion_order_create(ad_account_id => $ssio_insertion_order_create_ad_account_id, ssio_create_insertion_order_request => $ssio_insertion_order_create_ssio_create_insertion_order_request);

#
# ssio_insertion_order_edit test
#
# uncomment below and update the test
#my $ssio_insertion_order_edit_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_insertion_order_edit_ssio_edit_insertion_order_request = undef; # replace NULL with a proper value
#my $ssio_insertion_order_edit_result = $api->ssio_insertion_order_edit(ad_account_id => $ssio_insertion_order_edit_ad_account_id, ssio_edit_insertion_order_request => $ssio_insertion_order_edit_ssio_edit_insertion_order_request);

#
# ssio_insertion_orders_status_get_by_ad_account test
#
# uncomment below and update the test
#my $ssio_insertion_orders_status_get_by_ad_account_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_insertion_orders_status_get_by_ad_account_bookmark = undef; # replace NULL with a proper value
#my $ssio_insertion_orders_status_get_by_ad_account_page_size = undef; # replace NULL with a proper value
#my $ssio_insertion_orders_status_get_by_ad_account_result = $api->ssio_insertion_orders_status_get_by_ad_account(ad_account_id => $ssio_insertion_orders_status_get_by_ad_account_ad_account_id, bookmark => $ssio_insertion_orders_status_get_by_ad_account_bookmark, page_size => $ssio_insertion_orders_status_get_by_ad_account_page_size);

#
# ssio_insertion_orders_status_get_by_pin_order_id test
#
# uncomment below and update the test
#my $ssio_insertion_orders_status_get_by_pin_order_id_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_insertion_orders_status_get_by_pin_order_id_pin_order_id = undef; # replace NULL with a proper value
#my $ssio_insertion_orders_status_get_by_pin_order_id_result = $api->ssio_insertion_orders_status_get_by_pin_order_id(ad_account_id => $ssio_insertion_orders_status_get_by_pin_order_id_ad_account_id, pin_order_id => $ssio_insertion_orders_status_get_by_pin_order_id_pin_order_id);

#
# ssio_order_lines_get_by_ad_account test
#
# uncomment below and update the test
#my $ssio_order_lines_get_by_ad_account_ad_account_id = undef; # replace NULL with a proper value
#my $ssio_order_lines_get_by_ad_account_bookmark = undef; # replace NULL with a proper value
#my $ssio_order_lines_get_by_ad_account_page_size = undef; # replace NULL with a proper value
#my $ssio_order_lines_get_by_ad_account_pin_order_id = undef; # replace NULL with a proper value
#my $ssio_order_lines_get_by_ad_account_result = $api->ssio_order_lines_get_by_ad_account(ad_account_id => $ssio_order_lines_get_by_ad_account_ad_account_id, bookmark => $ssio_order_lines_get_by_ad_account_bookmark, page_size => $ssio_order_lines_get_by_ad_account_page_size, pin_order_id => $ssio_order_lines_get_by_ad_account_pin_order_id);


done_testing();
