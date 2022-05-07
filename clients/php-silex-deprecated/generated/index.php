<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/v5/ad_accounts/{adAccountId}/analytics', function(Application $app, Request $request, $ad_account_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $columns = $request->get('columns');
            $granularity = $request->get('granularity');
            $click_window_days = $request->get('click_window_days');
            $engagement_window_days = $request->get('engagement_window_days');
            $view_window_days = $request->get('view_window_days');
            $conversion_report_time = $request->get('conversion_report_time');
            return new Response('How about implementing adAccount/analytics as a GET method ?');
            });


$app->GET('/v5/ad_accounts', function(Application $app, Request $request) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            $include_shared_accounts = $request->get('include_shared_accounts');
            return new Response('How about implementing adAccounts/list as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/ad_groups/analytics', function(Application $app, Request $request, $ad_account_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $ad_group_ids = $request->get('ad_group_ids');
            $columns = $request->get('columns');
            $granularity = $request->get('granularity');
            $click_window_days = $request->get('click_window_days');
            $engagement_window_days = $request->get('engagement_window_days');
            $view_window_days = $request->get('view_window_days');
            $conversion_report_time = $request->get('conversion_report_time');
            return new Response('How about implementing adGroups/analytics as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/ad_groups', function(Application $app, Request $request, $ad_account_id) {
            $campaign_ids = $request->get('campaign_ids');
            $ad_group_ids = $request->get('ad_group_ids');
            $entity_statuses = $request->get('entity_statuses');
            $page_size = $request->get('page_size');
            $order = $request->get('order');
            $bookmark = $request->get('bookmark');
            $translate_interests_to_names = $request->get('translate_interests_to_names');
            return new Response('How about implementing adGroups/list as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/ads/analytics', function(Application $app, Request $request, $ad_account_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $ad_ids = $request->get('ad_ids');
            $columns = $request->get('columns');
            $granularity = $request->get('granularity');
            $click_window_days = $request->get('click_window_days');
            $engagement_window_days = $request->get('engagement_window_days');
            $view_window_days = $request->get('view_window_days');
            $conversion_report_time = $request->get('conversion_report_time');
            return new Response('How about implementing ads/analytics as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/ads', function(Application $app, Request $request, $ad_account_id) {
            $campaign_ids = $request->get('campaign_ids');
            $ad_group_ids = $request->get('ad_group_ids');
            $ad_ids = $request->get('ad_ids');
            $entity_statuses = $request->get('entity_statuses');
            $page_size = $request->get('page_size');
            $order = $request->get('order');
            $bookmark = $request->get('bookmark');
            return new Response('How about implementing ads/list as a GET method ?');
            });


$app->POST('/v5/ad_accounts/{adAccountId}/reports', function(Application $app, Request $request, $ad_account_id) {
            return new Response('How about implementing analytics/createReport as a POST method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/reports', function(Application $app, Request $request, $ad_account_id) {
            $token = $request->get('token');
            return new Response('How about implementing analytics/getReport as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/campaigns/analytics', function(Application $app, Request $request, $ad_account_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $campaign_ids = $request->get('campaign_ids');
            $columns = $request->get('columns');
            $granularity = $request->get('granularity');
            $click_window_days = $request->get('click_window_days');
            $engagement_window_days = $request->get('engagement_window_days');
            $view_window_days = $request->get('view_window_days');
            $conversion_report_time = $request->get('conversion_report_time');
            return new Response('How about implementing campaigns/analytics as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/campaigns', function(Application $app, Request $request, $ad_account_id) {
            $campaign_ids = $request->get('campaign_ids');
            $entity_statuses = $request->get('entity_statuses');
            $page_size = $request->get('page_size');
            $order = $request->get('order');
            $bookmark = $request->get('bookmark');
            return new Response('How about implementing campaigns/list as a GET method ?');
            });


$app->GET('/v5/ad_accounts/{adAccountId}/product_groups/analytics', function(Application $app, Request $request, $ad_account_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $product_group_ids = $request->get('product_group_ids');
            $columns = $request->get('columns');
            $granularity = $request->get('granularity');
            $click_window_days = $request->get('click_window_days');
            $engagement_window_days = $request->get('engagement_window_days');
            $view_window_days = $request->get('view_window_days');
            $conversion_report_time = $request->get('conversion_report_time');
            return new Response('How about implementing productGroups/analytics as a GET method ?');
            });


$app->POST('/v5/boards/{boardId}/sections', function(Application $app, Request $request, $board_id) {
            return new Response('How about implementing boardSections/create as a POST method ?');
            });


$app->DELETE('/v5/boards/{boardId}/sections/{sectionId}', function(Application $app, Request $request, $board_id, $section_id) {
            return new Response('How about implementing boardSections/delete as a DELETE method ?');
            });


$app->GET('/v5/boards/{boardId}/sections', function(Application $app, Request $request, $board_id) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing boardSections/list as a GET method ?');
            });


$app->GET('/v5/boards/{boardId}/sections/{sectionId}/pins', function(Application $app, Request $request, $board_id, $section_id) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing boardSections/listPins as a GET method ?');
            });


$app->PATCH('/v5/boards/{boardId}/sections/{sectionId}', function(Application $app, Request $request, $board_id, $section_id) {
            return new Response('How about implementing boardSections/update as a PATCH method ?');
            });


$app->POST('/v5/boards', function(Application $app, Request $request) {
            return new Response('How about implementing boards/create as a POST method ?');
            });


$app->DELETE('/v5/boards/{boardId}', function(Application $app, Request $request, $board_id) {
            return new Response('How about implementing boards/delete as a DELETE method ?');
            });


$app->GET('/v5/boards/{boardId}', function(Application $app, Request $request, $board_id) {
            return new Response('How about implementing boards/get as a GET method ?');
            });


$app->GET('/v5/boards', function(Application $app, Request $request) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            $privacy = $request->get('privacy');
            return new Response('How about implementing boards/list as a GET method ?');
            });


$app->GET('/v5/boards/{boardId}/pins', function(Application $app, Request $request, $board_id) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing boards/listPins as a GET method ?');
            });


$app->PATCH('/v5/boards/{boardId}', function(Application $app, Request $request, $board_id) {
            return new Response('How about implementing boards/update as a PATCH method ?');
            });


$app->POST('/v5/catalogs/product_groups', function(Application $app, Request $request) {
            return new Response('How about implementing catalogsProductGroups/create as a POST method ?');
            });


$app->DELETE('/v5/catalogs/product_groups/{productGroupId}', function(Application $app, Request $request, $product_group_id) {
            return new Response('How about implementing catalogsProductGroups/delete as a DELETE method ?');
            });


$app->GET('/v5/catalogs/product_groups', function(Application $app, Request $request) {
            $feed_id = $request->get('feed_id');
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing catalogsProductGroups/list as a GET method ?');
            });


$app->PATCH('/v5/catalogs/product_groups/{productGroupId}', function(Application $app, Request $request, $product_group_id) {
            return new Response('How about implementing catalogsProductGroups/update as a PATCH method ?');
            });


$app->GET('/v5/catalogs/feeds/{feedId}/processing_results', function(Application $app, Request $request, $feed_id) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing feedProcessingResults/list as a GET method ?');
            });


$app->POST('/v5/catalogs/feeds', function(Application $app, Request $request) {
            return new Response('How about implementing feeds/create as a POST method ?');
            });


$app->DELETE('/v5/catalogs/feeds/{feedId}', function(Application $app, Request $request, $feed_id) {
            return new Response('How about implementing feeds/delete as a DELETE method ?');
            });


$app->GET('/v5/catalogs/feeds/{feedId}', function(Application $app, Request $request, $feed_id) {
            return new Response('How about implementing feeds/get as a GET method ?');
            });


$app->GET('/v5/catalogs/feeds', function(Application $app, Request $request) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing feeds/list as a GET method ?');
            });


$app->PATCH('/v5/catalogs/feeds/{feedId}', function(Application $app, Request $request, $feed_id) {
            return new Response('How about implementing feeds/update as a PATCH method ?');
            });


$app->GET('/v5/catalogs/items', function(Application $app, Request $request) {
            $country = $request->get('country');
            $item_ids = $request->get('item_ids');
            $language = $request->get('language');
            return new Response('How about implementing items/get as a GET method ?');
            });


$app->GET('/v5/catalogs/items/batch/{batchId}', function(Application $app, Request $request, $batch_id) {
            return new Response('How about implementing itemsBatch/get as a GET method ?');
            });


$app->POST('/v5/catalogs/items/batch', function(Application $app, Request $request) {
            return new Response('How about implementing itemsBatch/post as a POST method ?');
            });


$app->POST('/v5/media', function(Application $app, Request $request) {
            return new Response('How about implementing media/create as a POST method ?');
            });


$app->GET('/v5/media/{mediaId}', function(Application $app, Request $request, $media_id) {
            return new Response('How about implementing media/get as a GET method ?');
            });


$app->GET('/v5/media', function(Application $app, Request $request) {
            $bookmark = $request->get('bookmark');
            $page_size = $request->get('page_size');
            return new Response('How about implementing media/list as a GET method ?');
            });


$app->POST('/v5/oauth/token', function(Application $app, Request $request) {
            $grant_type = $request->get('grant_type');
            return new Response('How about implementing oauth/token as a POST method ?');
            });


$app->GET('/v5/pins/{pinId}/analytics', function(Application $app, Request $request, $pin_id) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $app_types = $request->get('app_types');
            $metric_types = $request->get('metric_types');
            $split_field = $request->get('split_field');
            $ad_account_id = $request->get('ad_account_id');
            return new Response('How about implementing pins/analytics as a GET method ?');
            });


$app->POST('/v5/pins', function(Application $app, Request $request) {
            return new Response('How about implementing pins/create as a POST method ?');
            });


$app->DELETE('/v5/pins/{pinId}', function(Application $app, Request $request, $pin_id) {
            return new Response('How about implementing pins/delete as a DELETE method ?');
            });


$app->GET('/v5/pins/{pinId}', function(Application $app, Request $request, $pin_id) {
            $ad_account_id = $request->get('ad_account_id');
            return new Response('How about implementing pins/get as a GET method ?');
            });


$app->GET('/v5/user_account/analytics', function(Application $app, Request $request) {
            $start_date = $request->get('start_date');
            $end_date = $request->get('end_date');
            $from_claimed_content = $request->get('from_claimed_content');
            $pin_format = $request->get('pin_format');
            $app_types = $request->get('app_types');
            $metric_types = $request->get('metric_types');
            $split_field = $request->get('split_field');
            $ad_account_id = $request->get('ad_account_id');
            return new Response('How about implementing userAccount/analytics as a GET method ?');
            });


$app->GET('/v5/user_account', function(Application $app, Request $request) {
            $ad_account_id = $request->get('ad_account_id');
            return new Response('How about implementing userAccount/get as a GET method ?');
            });


$app->run();
