@isTest
private class OASAdResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = adResponse1;
        OASAdResponse adResponse3 = new OASAdResponse();
        OASAdResponse adResponse4 = adResponse3;

        System.assert(adResponse1.equals(adResponse2));
        System.assert(adResponse2.equals(adResponse1));
        System.assert(adResponse1.equals(adResponse1));
        System.assert(adResponse3.equals(adResponse4));
        System.assert(adResponse4.equals(adResponse3));
        System.assert(adResponse3.equals(adResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = OASAdResponse.getExample();
        OASAdResponse adResponse3 = new OASAdResponse();
        OASAdResponse adResponse4 = new OASAdResponse();

        System.assert(adResponse1.equals(adResponse2));
        System.assert(adResponse2.equals(adResponse1));
        System.assert(adResponse3.equals(adResponse4));
        System.assert(adResponse4.equals(adResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = new OASAdResponse();

        System.assertEquals(false, adResponse1.equals('foo'));
        System.assertEquals(false, adResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = new OASAdResponse();
        OASAdResponse adResponse3;

        System.assertEquals(false, adResponse1.equals(adResponse3));
        System.assertEquals(false, adResponse2.equals(adResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = new OASAdResponse();

        System.assertEquals(adResponse1.hashCode(), adResponse1.hashCode());
        System.assertEquals(adResponse2.hashCode(), adResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdResponse adResponse1 = OASAdResponse.getExample();
        OASAdResponse adResponse2 = OASAdResponse.getExample();
        OASAdResponse adResponse3 = new OASAdResponse();
        OASAdResponse adResponse4 = new OASAdResponse();

        System.assert(adResponse1.equals(adResponse2));
        System.assert(adResponse3.equals(adResponse4));
        System.assertEquals(adResponse1.hashCode(), adResponse2.hashCode());
        System.assertEquals(adResponse3.hashCode(), adResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdResponse adResponse = new OASAdResponse();
        Map<String, String> x-property-mappings = adResponse.getx-property-mappings();
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('carouselAndroidDeepLinks', x-property-mappings.get('carousel_android_deep_links'));
        System.assertEquals('carouselDestinationUrls', x-property-mappings.get('carousel_destination_urls'));
        System.assertEquals('carouselIosDeepLinks', x-property-mappings.get('carousel_ios_deep_links'));
        System.assertEquals('clickTrackingUrl', x-property-mappings.get('click_tracking_url'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
        System.assertEquals('destinationUrl', x-property-mappings.get('destination_url'));
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('isPinDeleted', x-property-mappings.get('is_pin_deleted'));
        System.assertEquals('isRemovable', x-property-mappings.get('is_removable'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('viewTrackingUrl', x-property-mappings.get('view_tracking_url'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('collectionItemsDestinationUrlTemplate', x-property-mappings.get('collection_items_destination_url_template'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('rejectedReasons', x-property-mappings.get('rejected_reasons'));
        System.assertEquals('rejectionLabels', x-property-mappings.get('rejection_labels'));
        System.assertEquals('reviewStatus', x-property-mappings.get('review_status'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('summaryStatus', x-property-mappings.get('summary_status'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdResponse adResponse = new OASAdResponse();
        System.assertEquals(new List<String>(), adResponse.carouselAndroidDeepLinks);
        System.assertEquals(new List<String>(), adResponse.carouselDestinationUrls);
        System.assertEquals(new List<String>(), adResponse.carouselIosDeepLinks);
        System.assertEquals(new List<RejectedReasonsEnum>(), adResponse.rejectedReasons);
        System.assertEquals(new List<String>(), adResponse.rejectionLabels);
        System.assertEquals(null, adResponse.adGroupId);
        System.assertEquals(null, adResponse.androidDeepLink);
        System.assertEquals(null, adResponse.clickTrackingUrl);
        System.assertEquals(null, adResponse.creativeType);
        System.assertEquals(null, adResponse.destinationUrl);
        System.assertEquals(null, adResponse.iosDeepLink);
        System.assertEquals(null, adResponse.isPinDeleted);
        System.assertEquals(null, adResponse.isRemovable);
        System.assertEquals(null, adResponse.name);
        System.assertEquals(null, adResponse.pinId);
        System.assertEquals(null, adResponse.status);
        System.assertEquals(null, adResponse.trackingUrls);
        System.assertEquals(null, adResponse.viewTrackingUrl);
        System.assertEquals(null, adResponse.adAccountId);
        System.assertEquals(null, adResponse.campaignId);
        System.assertEquals(null, adResponse.collectionItemsDestinationUrlTemplate);
        System.assertEquals(null, adResponse.createdTime);
        System.assertEquals(null, adResponse.id);
        System.assertEquals(null, adResponse.reviewStatus);
        System.assertEquals(null, adResponse.type);
        System.assertEquals(null, adResponse.updatedTime);
        System.assertEquals(null, adResponse.summaryStatus);
    }
}
