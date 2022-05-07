-module(openapi_ad_response_all_of_1).

-export([encode/1]).

-export_type([openapi_ad_response_all_of_1/0]).

-type openapi_ad_response_all_of_1() ::
    #{ 'ad_account_id' => binary(),
       'campaign_id' => binary(),
       'collection_items_destination_url_template' => binary(),
       'created_time' => integer(),
       'id' => binary(),
       'rejected_reasons' => list(),
       'rejection_labels' => list(),
       'review_status' => binary(),
       'type' => binary(),
       'updated_time' => integer(),
       'summary_status' => openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'campaign_id' := CampaignId,
          'collection_items_destination_url_template' := CollectionItemsDestinationUrlTemplate,
          'created_time' := CreatedTime,
          'id' := Id,
          'rejected_reasons' := RejectedReasons,
          'rejection_labels' := RejectionLabels,
          'review_status' := ReviewStatus,
          'type' := Type,
          'updated_time' := UpdatedTime,
          'summary_status' := SummaryStatus
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'campaign_id' => CampaignId,
       'collection_items_destination_url_template' => CollectionItemsDestinationUrlTemplate,
       'created_time' => CreatedTime,
       'id' => Id,
       'rejected_reasons' => RejectedReasons,
       'rejection_labels' => RejectionLabels,
       'review_status' => ReviewStatus,
       'type' => Type,
       'updated_time' => UpdatedTime,
       'summary_status' => SummaryStatus
     }.
