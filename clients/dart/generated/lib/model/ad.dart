//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Ad {
  /// Returns a new [Ad] instance.
  Ad({
    required this.adAccountId,
    required this.adGroupId,
    this.androidDeepLink,
    required this.campaignId,
    this.carouselAndroidDeepLinks = const [],
    this.carouselDestinationUrls = const [],
    this.carouselIosDeepLinks = const [],
    this.cartingPlatformType,
    this.cartingProducts = const [],
    this.clickTrackingUrl,
    this.collectionItemsDestinationUrlTemplate,
    this.collectionsHeaderType,
    this.createdTime,
    required this.creativeType,
    this.customizableCtaType,
    this.destinationUrl,
    this.disclosureType,
    this.disclosureUrl,
    this.gridClickType,
    required this.id,
    this.iosDeepLink,
    this.isCarting,
    this.isCollageAcceptedTerms,
    this.isCollageSingleDestination,
    this.isPinDeleted,
    this.isRemovable,
    this.leadFormId,
    this.name,
    required this.pinId,
    this.quizPinData,
    this.rejectedReasons = const [],
    this.rejectionLabels = const [],
    required this.reviewStatus,
    this.status,
    required this.summaryStatus,
    this.trackingUrls,
    required this.type,
    this.updatedTime,
    this.viewTrackingUrl,
  });

  /// The ID of the advertiser that this ad belongs to.
  String adAccountId;

  /// ID of the ad group that contains the ad.
  String adGroupId;

  /// Deep link URL for Android devices.
  String? androidDeepLink;

  /// ID of the ad campaign that contains this ad.
  String campaignId;

  /// Comma-separated deep links for the carousel pin on Android.
  List<String>? carouselAndroidDeepLinks;

  /// Comma-separated destination URLs for the carousel pin to promote.
  List<String>? carouselDestinationUrls;

  /// Comma-separated deep links for the carousel pin on iOS.
  List<String>? carouselIosDeepLinks;

  /// The vendor platform type of the carting/WTB ad.
  ///
  /// Minimum value: 1
  /// Maximum value: 2
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? cartingPlatformType;

  /// Array of carting/WTB products for the ad.
  List<CartingProduct> cartingProducts;

  /// Tracking url for the ad clicks.
  String? clickTrackingUrl;

  /// Destination URL template for all items within a collections drawer.
  String? collectionItemsDestinationUrlTemplate;

  AdCollectionsHeaderType? collectionsHeaderType;

  /// Pin creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  CreativeType creativeType;

  CustomizableCTAType? customizableCtaType;

  /// Destination URL.
  String? destinationUrl;

  DisclosureType? disclosureType;

  /// URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  String? disclosureUrl;

  GridClickType? gridClickType;

  /// The ID of this ad.
  String id;

  /// Deep link URL for iOS devices.
  String? iosDeepLink;

  /// Is the ad a carting/WTB ad?
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isCarting;

  /// Whether the advertiser has accepted the terms and conditions for collage ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isCollageAcceptedTerms;

  /// Whether the collage ad has a single destination url override.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isCollageSingleDestination;

  /// Is original pin deleted?
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isPinDeleted;

  /// Is pin repinnable?
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isRemovable;

  /// Lead form ID for lead ad generation.
  String? leadFormId;

  /// Name of the ad - 255 chars max.
  String? name;

  /// Pin ID. This field may only be updated for draft ads.
  String pinId;

  /// Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  QuizPinData? quizPinData;

  /// Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  List<AdDisapprovalReasons> rejectedReasons;

  /// Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  List<String> rejectionLabels;

  /// Ad review status
  AdReviewStatus reviewStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  /// Ad summary status
  PinPromotionSummaryStatus summaryStatus;

  TrackingUrls? trackingUrls;

  /// Always \"ad\".
  String type;

  /// Last update time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  /// Tracking URL for ad impressions.
  String? viewTrackingUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Ad &&
    other.adAccountId == adAccountId &&
    other.adGroupId == adGroupId &&
    other.androidDeepLink == androidDeepLink &&
    other.campaignId == campaignId &&
    _deepEquality.equals(other.carouselAndroidDeepLinks, carouselAndroidDeepLinks) &&
    _deepEquality.equals(other.carouselDestinationUrls, carouselDestinationUrls) &&
    _deepEquality.equals(other.carouselIosDeepLinks, carouselIosDeepLinks) &&
    other.cartingPlatformType == cartingPlatformType &&
    _deepEquality.equals(other.cartingProducts, cartingProducts) &&
    other.clickTrackingUrl == clickTrackingUrl &&
    other.collectionItemsDestinationUrlTemplate == collectionItemsDestinationUrlTemplate &&
    other.collectionsHeaderType == collectionsHeaderType &&
    other.createdTime == createdTime &&
    other.creativeType == creativeType &&
    other.customizableCtaType == customizableCtaType &&
    other.destinationUrl == destinationUrl &&
    other.disclosureType == disclosureType &&
    other.disclosureUrl == disclosureUrl &&
    other.gridClickType == gridClickType &&
    other.id == id &&
    other.iosDeepLink == iosDeepLink &&
    other.isCarting == isCarting &&
    other.isCollageAcceptedTerms == isCollageAcceptedTerms &&
    other.isCollageSingleDestination == isCollageSingleDestination &&
    other.isPinDeleted == isPinDeleted &&
    other.isRemovable == isRemovable &&
    other.leadFormId == leadFormId &&
    other.name == name &&
    other.pinId == pinId &&
    other.quizPinData == quizPinData &&
    _deepEquality.equals(other.rejectedReasons, rejectedReasons) &&
    _deepEquality.equals(other.rejectionLabels, rejectionLabels) &&
    other.reviewStatus == reviewStatus &&
    other.status == status &&
    other.summaryStatus == summaryStatus &&
    other.trackingUrls == trackingUrls &&
    other.type == type &&
    other.updatedTime == updatedTime &&
    other.viewTrackingUrl == viewTrackingUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId.hashCode) +
    (adGroupId.hashCode) +
    (androidDeepLink == null ? 0 : androidDeepLink!.hashCode) +
    (campaignId.hashCode) +
    (carouselAndroidDeepLinks == null ? 0 : carouselAndroidDeepLinks!.hashCode) +
    (carouselDestinationUrls == null ? 0 : carouselDestinationUrls!.hashCode) +
    (carouselIosDeepLinks == null ? 0 : carouselIosDeepLinks!.hashCode) +
    (cartingPlatformType == null ? 0 : cartingPlatformType!.hashCode) +
    (cartingProducts.hashCode) +
    (clickTrackingUrl == null ? 0 : clickTrackingUrl!.hashCode) +
    (collectionItemsDestinationUrlTemplate == null ? 0 : collectionItemsDestinationUrlTemplate!.hashCode) +
    (collectionsHeaderType == null ? 0 : collectionsHeaderType!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (creativeType.hashCode) +
    (customizableCtaType == null ? 0 : customizableCtaType!.hashCode) +
    (destinationUrl == null ? 0 : destinationUrl!.hashCode) +
    (disclosureType == null ? 0 : disclosureType!.hashCode) +
    (disclosureUrl == null ? 0 : disclosureUrl!.hashCode) +
    (gridClickType == null ? 0 : gridClickType!.hashCode) +
    (id.hashCode) +
    (iosDeepLink == null ? 0 : iosDeepLink!.hashCode) +
    (isCarting == null ? 0 : isCarting!.hashCode) +
    (isCollageAcceptedTerms == null ? 0 : isCollageAcceptedTerms!.hashCode) +
    (isCollageSingleDestination == null ? 0 : isCollageSingleDestination!.hashCode) +
    (isPinDeleted == null ? 0 : isPinDeleted!.hashCode) +
    (isRemovable == null ? 0 : isRemovable!.hashCode) +
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (pinId.hashCode) +
    (quizPinData == null ? 0 : quizPinData!.hashCode) +
    (rejectedReasons.hashCode) +
    (rejectionLabels.hashCode) +
    (reviewStatus.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (summaryStatus.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (type.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode) +
    (viewTrackingUrl == null ? 0 : viewTrackingUrl!.hashCode);

  @override
  String toString() => 'Ad[adAccountId=$adAccountId, adGroupId=$adGroupId, androidDeepLink=$androidDeepLink, campaignId=$campaignId, carouselAndroidDeepLinks=$carouselAndroidDeepLinks, carouselDestinationUrls=$carouselDestinationUrls, carouselIosDeepLinks=$carouselIosDeepLinks, cartingPlatformType=$cartingPlatformType, cartingProducts=$cartingProducts, clickTrackingUrl=$clickTrackingUrl, collectionItemsDestinationUrlTemplate=$collectionItemsDestinationUrlTemplate, collectionsHeaderType=$collectionsHeaderType, createdTime=$createdTime, creativeType=$creativeType, customizableCtaType=$customizableCtaType, destinationUrl=$destinationUrl, disclosureType=$disclosureType, disclosureUrl=$disclosureUrl, gridClickType=$gridClickType, id=$id, iosDeepLink=$iosDeepLink, isCarting=$isCarting, isCollageAcceptedTerms=$isCollageAcceptedTerms, isCollageSingleDestination=$isCollageSingleDestination, isPinDeleted=$isPinDeleted, isRemovable=$isRemovable, leadFormId=$leadFormId, name=$name, pinId=$pinId, quizPinData=$quizPinData, rejectedReasons=$rejectedReasons, rejectionLabels=$rejectionLabels, reviewStatus=$reviewStatus, status=$status, summaryStatus=$summaryStatus, trackingUrls=$trackingUrls, type=$type, updatedTime=$updatedTime, viewTrackingUrl=$viewTrackingUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_account_id'] = this.adAccountId;
      json[r'ad_group_id'] = this.adGroupId;
    if (this.androidDeepLink != null) {
      json[r'android_deep_link'] = this.androidDeepLink;
    } else {
      json[r'android_deep_link'] = null;
    }
      json[r'campaign_id'] = this.campaignId;
    if (this.carouselAndroidDeepLinks != null) {
      json[r'carousel_android_deep_links'] = this.carouselAndroidDeepLinks;
    } else {
      json[r'carousel_android_deep_links'] = null;
    }
    if (this.carouselDestinationUrls != null) {
      json[r'carousel_destination_urls'] = this.carouselDestinationUrls;
    } else {
      json[r'carousel_destination_urls'] = null;
    }
    if (this.carouselIosDeepLinks != null) {
      json[r'carousel_ios_deep_links'] = this.carouselIosDeepLinks;
    } else {
      json[r'carousel_ios_deep_links'] = null;
    }
    if (this.cartingPlatformType != null) {
      json[r'carting_platform_type'] = this.cartingPlatformType;
    } else {
      json[r'carting_platform_type'] = null;
    }
      json[r'carting_products'] = this.cartingProducts;
    if (this.clickTrackingUrl != null) {
      json[r'click_tracking_url'] = this.clickTrackingUrl;
    } else {
      json[r'click_tracking_url'] = null;
    }
    if (this.collectionItemsDestinationUrlTemplate != null) {
      json[r'collection_items_destination_url_template'] = this.collectionItemsDestinationUrlTemplate;
    } else {
      json[r'collection_items_destination_url_template'] = null;
    }
    if (this.collectionsHeaderType != null) {
      json[r'collections_header_type'] = this.collectionsHeaderType;
    } else {
      json[r'collections_header_type'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
      json[r'creative_type'] = this.creativeType;
    if (this.customizableCtaType != null) {
      json[r'customizable_cta_type'] = this.customizableCtaType;
    } else {
      json[r'customizable_cta_type'] = null;
    }
    if (this.destinationUrl != null) {
      json[r'destination_url'] = this.destinationUrl;
    } else {
      json[r'destination_url'] = null;
    }
    if (this.disclosureType != null) {
      json[r'disclosure_type'] = this.disclosureType;
    } else {
      json[r'disclosure_type'] = null;
    }
    if (this.disclosureUrl != null) {
      json[r'disclosure_url'] = this.disclosureUrl;
    } else {
      json[r'disclosure_url'] = null;
    }
    if (this.gridClickType != null) {
      json[r'grid_click_type'] = this.gridClickType;
    } else {
      json[r'grid_click_type'] = null;
    }
      json[r'id'] = this.id;
    if (this.iosDeepLink != null) {
      json[r'ios_deep_link'] = this.iosDeepLink;
    } else {
      json[r'ios_deep_link'] = null;
    }
    if (this.isCarting != null) {
      json[r'is_carting'] = this.isCarting;
    } else {
      json[r'is_carting'] = null;
    }
    if (this.isCollageAcceptedTerms != null) {
      json[r'is_collage_accepted_terms'] = this.isCollageAcceptedTerms;
    } else {
      json[r'is_collage_accepted_terms'] = null;
    }
    if (this.isCollageSingleDestination != null) {
      json[r'is_collage_single_destination'] = this.isCollageSingleDestination;
    } else {
      json[r'is_collage_single_destination'] = null;
    }
    if (this.isPinDeleted != null) {
      json[r'is_pin_deleted'] = this.isPinDeleted;
    } else {
      json[r'is_pin_deleted'] = null;
    }
    if (this.isRemovable != null) {
      json[r'is_removable'] = this.isRemovable;
    } else {
      json[r'is_removable'] = null;
    }
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'pin_id'] = this.pinId;
    if (this.quizPinData != null) {
      json[r'quiz_pin_data'] = this.quizPinData;
    } else {
      json[r'quiz_pin_data'] = null;
    }
      json[r'rejected_reasons'] = this.rejectedReasons;
      json[r'rejection_labels'] = this.rejectionLabels;
      json[r'review_status'] = this.reviewStatus;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'summary_status'] = this.summaryStatus;
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
      json[r'type'] = this.type;
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    if (this.viewTrackingUrl != null) {
      json[r'view_tracking_url'] = this.viewTrackingUrl;
    } else {
      json[r'view_tracking_url'] = null;
    }
    return json;
  }

  /// Returns a new [Ad] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Ad? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_account_id'), 'Required key "Ad[ad_account_id]" is missing from JSON.');
        assert(json[r'ad_account_id'] != null, 'Required key "Ad[ad_account_id]" has a null value in JSON.');
        assert(json.containsKey(r'ad_group_id'), 'Required key "Ad[ad_group_id]" is missing from JSON.');
        assert(json[r'ad_group_id'] != null, 'Required key "Ad[ad_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'campaign_id'), 'Required key "Ad[campaign_id]" is missing from JSON.');
        assert(json[r'campaign_id'] != null, 'Required key "Ad[campaign_id]" has a null value in JSON.');
        assert(json.containsKey(r'creative_type'), 'Required key "Ad[creative_type]" is missing from JSON.');
        assert(json[r'creative_type'] != null, 'Required key "Ad[creative_type]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "Ad[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Ad[id]" has a null value in JSON.');
        assert(json.containsKey(r'pin_id'), 'Required key "Ad[pin_id]" is missing from JSON.');
        assert(json[r'pin_id'] != null, 'Required key "Ad[pin_id]" has a null value in JSON.');
        assert(json.containsKey(r'rejected_reasons'), 'Required key "Ad[rejected_reasons]" is missing from JSON.');
        assert(json[r'rejected_reasons'] != null, 'Required key "Ad[rejected_reasons]" has a null value in JSON.');
        assert(json.containsKey(r'rejection_labels'), 'Required key "Ad[rejection_labels]" is missing from JSON.');
        assert(json[r'rejection_labels'] != null, 'Required key "Ad[rejection_labels]" has a null value in JSON.');
        assert(json.containsKey(r'review_status'), 'Required key "Ad[review_status]" is missing from JSON.');
        assert(json[r'review_status'] != null, 'Required key "Ad[review_status]" has a null value in JSON.');
        assert(json.containsKey(r'summary_status'), 'Required key "Ad[summary_status]" is missing from JSON.');
        assert(json[r'summary_status'] != null, 'Required key "Ad[summary_status]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "Ad[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "Ad[type]" has a null value in JSON.');
        return true;
      }());

      return Ad(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id')!,
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        androidDeepLink: mapValueOfType<String>(json, r'android_deep_link'),
        campaignId: mapValueOfType<String>(json, r'campaign_id')!,
        carouselAndroidDeepLinks: json[r'carousel_android_deep_links'] is Iterable
            ? (json[r'carousel_android_deep_links'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        carouselDestinationUrls: json[r'carousel_destination_urls'] is Iterable
            ? (json[r'carousel_destination_urls'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        carouselIosDeepLinks: json[r'carousel_ios_deep_links'] is Iterable
            ? (json[r'carousel_ios_deep_links'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        cartingPlatformType: mapValueOfType<int>(json, r'carting_platform_type'),
        cartingProducts: CartingProduct.listFromJson(json[r'carting_products']),
        clickTrackingUrl: mapValueOfType<String>(json, r'click_tracking_url'),
        collectionItemsDestinationUrlTemplate: mapValueOfType<String>(json, r'collection_items_destination_url_template'),
        collectionsHeaderType: AdCollectionsHeaderType.fromJson(json[r'collections_header_type']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        creativeType: CreativeType.fromJson(json[r'creative_type'])!,
        customizableCtaType: CustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        destinationUrl: mapValueOfType<String>(json, r'destination_url'),
        disclosureType: DisclosureType.fromJson(json[r'disclosure_type']),
        disclosureUrl: mapValueOfType<String>(json, r'disclosure_url'),
        gridClickType: GridClickType.fromJson(json[r'grid_click_type']),
        id: mapValueOfType<String>(json, r'id')!,
        iosDeepLink: mapValueOfType<String>(json, r'ios_deep_link'),
        isCarting: mapValueOfType<bool>(json, r'is_carting'),
        isCollageAcceptedTerms: mapValueOfType<bool>(json, r'is_collage_accepted_terms'),
        isCollageSingleDestination: mapValueOfType<bool>(json, r'is_collage_single_destination'),
        isPinDeleted: mapValueOfType<bool>(json, r'is_pin_deleted'),
        isRemovable: mapValueOfType<bool>(json, r'is_removable'),
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        name: mapValueOfType<String>(json, r'name'),
        pinId: mapValueOfType<String>(json, r'pin_id')!,
        quizPinData: QuizPinData.fromJson(json[r'quiz_pin_data']),
        rejectedReasons: AdDisapprovalReasons.listFromJson(json[r'rejected_reasons']),
        rejectionLabels: json[r'rejection_labels'] is Iterable
            ? (json[r'rejection_labels'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        reviewStatus: AdReviewStatus.fromJson(json[r'review_status'])!,
        status: EntityStatus.fromJson(json[r'status']),
        summaryStatus: PinPromotionSummaryStatus.fromJson(json[r'summary_status'])!,
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        type: mapValueOfType<String>(json, r'type')!,
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
        viewTrackingUrl: mapValueOfType<String>(json, r'view_tracking_url'),
      );
    }
    return null;
  }

  static List<Ad> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Ad>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Ad.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Ad> mapFromJson(dynamic json) {
    final map = <String, Ad>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Ad.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Ad-objects as value to a dart map
  static Map<String, List<Ad>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Ad>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Ad.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_account_id',
    'ad_group_id',
    'campaign_id',
    'creative_type',
    'id',
    'pin_id',
    'rejected_reasons',
    'rejection_labels',
    'review_status',
    'summary_status',
    'type',
  };
}

