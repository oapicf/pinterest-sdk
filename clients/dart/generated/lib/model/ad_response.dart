//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdResponse {
  /// Returns a new [AdResponse] instance.
  AdResponse({
    this.adGroupId,
    this.androidDeepLink,
    this.carouselAndroidDeepLinks = const [],
    this.carouselDestinationUrls = const [],
    this.carouselIosDeepLinks = const [],
    this.clickTrackingUrl,
    this.creativeType,
    this.customizableCtaType,
    this.destinationUrl,
    this.disclosureType,
    this.disclosureUrl,
    this.gridClickType,
    this.iosDeepLink,
    this.isPinDeleted,
    this.isRemovable,
    this.leadFormId,
    this.name,
    this.quizPinData,
    this.status,
    this.trackingUrls,
    this.viewTrackingUrl,
    this.pinId,
    this.adAccountId,
    this.campaignId,
    this.collectionItemsDestinationUrlTemplate,
    this.createdTime,
    this.id,
    this.rejectedReasons = const [],
    this.rejectionLabels = const [],
    this.reviewStatus,
    this.summaryStatus,
    this.type,
    this.updatedTime,
  });

  /// ID of the ad group that contains the ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adGroupId;

  /// Deep link URL for Android devices.
  String? androidDeepLink;

  /// Comma-separated deep links for the carousel pin on Android.
  List<String>? carouselAndroidDeepLinks;

  /// Comma-separated destination URLs for the carousel pin to promote.
  List<String>? carouselDestinationUrls;

  /// Comma-separated deep links for the carousel pin on iOS.
  List<String>? carouselIosDeepLinks;

  /// Tracking url for the ad clicks.
  String? clickTrackingUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreativeType? creativeType;

  CustomizableCTAType? customizableCtaType;

  /// Destination URL.
  String? destinationUrl;

  DisclosureType? disclosureType;

  /// URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  String? disclosureUrl;

  GridClickType? gridClickType;

  /// Deep link URL for iOS devices.
  String? iosDeepLink;

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

  /// Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  QuizPinData? quizPinData;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  TrackingUrls? trackingUrls;

  /// Tracking URL for ad impressions.
  String? viewTrackingUrl;

  /// Pin ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pinId;

  /// The ID of the advertiser that this ad belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// ID of the ad campaign that contains this ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignId;

  /// Destination URL template for all items within a collections drawer.
  String? collectionItemsDestinationUrlTemplate;

  /// Pin creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// The ID of this ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  List<AdResponseRejectedReasonsEnum> rejectedReasons;

  /// Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  List<String> rejectionLabels;

  /// Ad review status
  AdResponseReviewStatusEnum? reviewStatus;

  /// Ad summary status
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PinPromotionSummaryStatus? summaryStatus;

  /// Always \"ad\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Last update time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdResponse &&
    other.adGroupId == adGroupId &&
    other.androidDeepLink == androidDeepLink &&
    _deepEquality.equals(other.carouselAndroidDeepLinks, carouselAndroidDeepLinks) &&
    _deepEquality.equals(other.carouselDestinationUrls, carouselDestinationUrls) &&
    _deepEquality.equals(other.carouselIosDeepLinks, carouselIosDeepLinks) &&
    other.clickTrackingUrl == clickTrackingUrl &&
    other.creativeType == creativeType &&
    other.customizableCtaType == customizableCtaType &&
    other.destinationUrl == destinationUrl &&
    other.disclosureType == disclosureType &&
    other.disclosureUrl == disclosureUrl &&
    other.gridClickType == gridClickType &&
    other.iosDeepLink == iosDeepLink &&
    other.isPinDeleted == isPinDeleted &&
    other.isRemovable == isRemovable &&
    other.leadFormId == leadFormId &&
    other.name == name &&
    other.quizPinData == quizPinData &&
    other.status == status &&
    other.trackingUrls == trackingUrls &&
    other.viewTrackingUrl == viewTrackingUrl &&
    other.pinId == pinId &&
    other.adAccountId == adAccountId &&
    other.campaignId == campaignId &&
    other.collectionItemsDestinationUrlTemplate == collectionItemsDestinationUrlTemplate &&
    other.createdTime == createdTime &&
    other.id == id &&
    _deepEquality.equals(other.rejectedReasons, rejectedReasons) &&
    _deepEquality.equals(other.rejectionLabels, rejectionLabels) &&
    other.reviewStatus == reviewStatus &&
    other.summaryStatus == summaryStatus &&
    other.type == type &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupId == null ? 0 : adGroupId!.hashCode) +
    (androidDeepLink == null ? 0 : androidDeepLink!.hashCode) +
    (carouselAndroidDeepLinks == null ? 0 : carouselAndroidDeepLinks!.hashCode) +
    (carouselDestinationUrls == null ? 0 : carouselDestinationUrls!.hashCode) +
    (carouselIosDeepLinks == null ? 0 : carouselIosDeepLinks!.hashCode) +
    (clickTrackingUrl == null ? 0 : clickTrackingUrl!.hashCode) +
    (creativeType == null ? 0 : creativeType!.hashCode) +
    (customizableCtaType == null ? 0 : customizableCtaType!.hashCode) +
    (destinationUrl == null ? 0 : destinationUrl!.hashCode) +
    (disclosureType == null ? 0 : disclosureType!.hashCode) +
    (disclosureUrl == null ? 0 : disclosureUrl!.hashCode) +
    (gridClickType == null ? 0 : gridClickType!.hashCode) +
    (iosDeepLink == null ? 0 : iosDeepLink!.hashCode) +
    (isPinDeleted == null ? 0 : isPinDeleted!.hashCode) +
    (isRemovable == null ? 0 : isRemovable!.hashCode) +
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (quizPinData == null ? 0 : quizPinData!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (viewTrackingUrl == null ? 0 : viewTrackingUrl!.hashCode) +
    (pinId == null ? 0 : pinId!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (collectionItemsDestinationUrlTemplate == null ? 0 : collectionItemsDestinationUrlTemplate!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (rejectedReasons.hashCode) +
    (rejectionLabels.hashCode) +
    (reviewStatus == null ? 0 : reviewStatus!.hashCode) +
    (summaryStatus == null ? 0 : summaryStatus!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'AdResponse[adGroupId=$adGroupId, androidDeepLink=$androidDeepLink, carouselAndroidDeepLinks=$carouselAndroidDeepLinks, carouselDestinationUrls=$carouselDestinationUrls, carouselIosDeepLinks=$carouselIosDeepLinks, clickTrackingUrl=$clickTrackingUrl, creativeType=$creativeType, customizableCtaType=$customizableCtaType, destinationUrl=$destinationUrl, disclosureType=$disclosureType, disclosureUrl=$disclosureUrl, gridClickType=$gridClickType, iosDeepLink=$iosDeepLink, isPinDeleted=$isPinDeleted, isRemovable=$isRemovable, leadFormId=$leadFormId, name=$name, quizPinData=$quizPinData, status=$status, trackingUrls=$trackingUrls, viewTrackingUrl=$viewTrackingUrl, pinId=$pinId, adAccountId=$adAccountId, campaignId=$campaignId, collectionItemsDestinationUrlTemplate=$collectionItemsDestinationUrlTemplate, createdTime=$createdTime, id=$id, rejectedReasons=$rejectedReasons, rejectionLabels=$rejectionLabels, reviewStatus=$reviewStatus, summaryStatus=$summaryStatus, type=$type, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adGroupId != null) {
      json[r'ad_group_id'] = this.adGroupId;
    } else {
      json[r'ad_group_id'] = null;
    }
    if (this.androidDeepLink != null) {
      json[r'android_deep_link'] = this.androidDeepLink;
    } else {
      json[r'android_deep_link'] = null;
    }
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
    if (this.clickTrackingUrl != null) {
      json[r'click_tracking_url'] = this.clickTrackingUrl;
    } else {
      json[r'click_tracking_url'] = null;
    }
    if (this.creativeType != null) {
      json[r'creative_type'] = this.creativeType;
    } else {
      json[r'creative_type'] = null;
    }
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
    if (this.iosDeepLink != null) {
      json[r'ios_deep_link'] = this.iosDeepLink;
    } else {
      json[r'ios_deep_link'] = null;
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
    if (this.quizPinData != null) {
      json[r'quiz_pin_data'] = this.quizPinData;
    } else {
      json[r'quiz_pin_data'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
    if (this.viewTrackingUrl != null) {
      json[r'view_tracking_url'] = this.viewTrackingUrl;
    } else {
      json[r'view_tracking_url'] = null;
    }
    if (this.pinId != null) {
      json[r'pin_id'] = this.pinId;
    } else {
      json[r'pin_id'] = null;
    }
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.campaignId != null) {
      json[r'campaign_id'] = this.campaignId;
    } else {
      json[r'campaign_id'] = null;
    }
    if (this.collectionItemsDestinationUrlTemplate != null) {
      json[r'collection_items_destination_url_template'] = this.collectionItemsDestinationUrlTemplate;
    } else {
      json[r'collection_items_destination_url_template'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'rejected_reasons'] = this.rejectedReasons;
      json[r'rejection_labels'] = this.rejectionLabels;
    if (this.reviewStatus != null) {
      json[r'review_status'] = this.reviewStatus;
    } else {
      json[r'review_status'] = null;
    }
    if (this.summaryStatus != null) {
      json[r'summary_status'] = this.summaryStatus;
    } else {
      json[r'summary_status'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [AdResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdResponse(
        adGroupId: mapValueOfType<String>(json, r'ad_group_id'),
        androidDeepLink: mapValueOfType<String>(json, r'android_deep_link'),
        carouselAndroidDeepLinks: json[r'carousel_android_deep_links'] is Iterable
            ? (json[r'carousel_android_deep_links'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        carouselDestinationUrls: json[r'carousel_destination_urls'] is Iterable
            ? (json[r'carousel_destination_urls'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        carouselIosDeepLinks: json[r'carousel_ios_deep_links'] is Iterable
            ? (json[r'carousel_ios_deep_links'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        clickTrackingUrl: mapValueOfType<String>(json, r'click_tracking_url'),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
        customizableCtaType: CustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        destinationUrl: mapValueOfType<String>(json, r'destination_url'),
        disclosureType: DisclosureType.fromJson(json[r'disclosure_type']),
        disclosureUrl: mapValueOfType<String>(json, r'disclosure_url'),
        gridClickType: GridClickType.fromJson(json[r'grid_click_type']),
        iosDeepLink: mapValueOfType<String>(json, r'ios_deep_link'),
        isPinDeleted: mapValueOfType<bool>(json, r'is_pin_deleted'),
        isRemovable: mapValueOfType<bool>(json, r'is_removable'),
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        name: mapValueOfType<String>(json, r'name'),
        quizPinData: QuizPinData.fromJson(json[r'quiz_pin_data']),
        status: EntityStatus.fromJson(json[r'status']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        viewTrackingUrl: mapValueOfType<String>(json, r'view_tracking_url'),
        pinId: mapValueOfType<String>(json, r'pin_id'),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        campaignId: mapValueOfType<String>(json, r'campaign_id'),
        collectionItemsDestinationUrlTemplate: mapValueOfType<String>(json, r'collection_items_destination_url_template'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        rejectedReasons: AdResponseRejectedReasonsEnum.listFromJson(json[r'rejected_reasons']),
        rejectionLabels: json[r'rejection_labels'] is Iterable
            ? (json[r'rejection_labels'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        reviewStatus: AdResponseReviewStatusEnum.fromJson(json[r'review_status']),
        summaryStatus: PinPromotionSummaryStatus.fromJson(json[r'summary_status']),
        type: mapValueOfType<String>(json, r'type'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<AdResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdResponse> mapFromJson(dynamic json) {
    final map = <String, AdResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdResponse-objects as value to a dart map
  static Map<String, List<AdResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// ad disapproval reasons
class AdResponseRejectedReasonsEnum {
  /// Instantiate a new enum with the provided [value].
  const AdResponseRejectedReasonsEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HASHTAGS = AdResponseRejectedReasonsEnum._(r'HASHTAGS');
  static const PROMOTIONS_AND_PRICES = AdResponseRejectedReasonsEnum._(r'PROMOTIONS_AND_PRICES');
  static const TARGETING = AdResponseRejectedReasonsEnum._(r'TARGETING');
  static const LANDING_PAGE = AdResponseRejectedReasonsEnum._(r'LANDING_PAGE');
  static const CAPS_AND_SYMBOLS = AdResponseRejectedReasonsEnum._(r'CAPS_AND_SYMBOLS');
  static const SHOCKING = AdResponseRejectedReasonsEnum._(r'SHOCKING');
  static const WEIGHT_LOSS = AdResponseRejectedReasonsEnum._(r'WEIGHT_LOSS');
  static const PROHIBITED_PRODUCT = AdResponseRejectedReasonsEnum._(r'PROHIBITED_PRODUCT');
  static const AUTHENTICITY = AdResponseRejectedReasonsEnum._(r'AUTHENTICITY');
  static const NUDITY = AdResponseRejectedReasonsEnum._(r'NUDITY');
  static const CONFUSING_DESIGN = AdResponseRejectedReasonsEnum._(r'CONFUSING_DESIGN');
  static const URGENCY = AdResponseRejectedReasonsEnum._(r'URGENCY');
  static const RATINGS = AdResponseRejectedReasonsEnum._(r'RATINGS');
  static const APP = AdResponseRejectedReasonsEnum._(r'APP');
  static const ALCOHOL = AdResponseRejectedReasonsEnum._(r'ALCOHOL');
  static const CONTESTS = AdResponseRejectedReasonsEnum._(r'CONTESTS');
  static const POLITICAL = AdResponseRejectedReasonsEnum._(r'POLITICAL');
  static const OTHER = AdResponseRejectedReasonsEnum._(r'OTHER');
  static const IMAGE = AdResponseRejectedReasonsEnum._(r'IMAGE');
  static const NAR = AdResponseRejectedReasonsEnum._(r'NAR');
  static const INCONSISTENT = AdResponseRejectedReasonsEnum._(r'INCONSISTENT');
  static const CLICKBAIT = AdResponseRejectedReasonsEnum._(r'CLICKBAIT');
  static const NO_DESCRIPTION = AdResponseRejectedReasonsEnum._(r'NO_DESCRIPTION');
  static const LOW_QUALITY = AdResponseRejectedReasonsEnum._(r'LOW_QUALITY');
  static const EXAGGERATED_CLAIMS = AdResponseRejectedReasonsEnum._(r'EXAGGERATED_CLAIMS');
  static const PINTEREST_BRAND = AdResponseRejectedReasonsEnum._(r'PINTEREST_BRAND');
  static const ALCOHOL_NO_SALE = AdResponseRejectedReasonsEnum._(r'ALCOHOL_NO_SALE');
  static const LANDING_PAGE_SPEED = AdResponseRejectedReasonsEnum._(r'LANDING_PAGE_SPEED');
  static const LANDING_PAGE_HARDWALL = AdResponseRejectedReasonsEnum._(r'LANDING_PAGE_HARDWALL');
  static const LANDING_PAGE_BROKEN = AdResponseRejectedReasonsEnum._(r'LANDING_PAGE_BROKEN');
  static const LANDING_PAGE_QUALITY = AdResponseRejectedReasonsEnum._(r'LANDING_PAGE_QUALITY');
  static const OUT_OF_STOCK = AdResponseRejectedReasonsEnum._(r'OUT_OF_STOCK');
  static const IMAGE_LOW_QUALITY = AdResponseRejectedReasonsEnum._(r'IMAGE_LOW_QUALITY');
  static const IMAGE_BUSY = AdResponseRejectedReasonsEnum._(r'IMAGE_BUSY');
  static const IMAGE_POORLY_EDITED = AdResponseRejectedReasonsEnum._(r'IMAGE_POORLY_EDITED');
  static const IMAGE_BEFORE_AFTER = AdResponseRejectedReasonsEnum._(r'IMAGE_BEFORE_AFTER');
  static const UGC = AdResponseRejectedReasonsEnum._(r'UGC');
  static const FAKE_BUTTONS = AdResponseRejectedReasonsEnum._(r'FAKE_BUTTONS');
  static const WEAPONS = AdResponseRejectedReasonsEnum._(r'WEAPONS');
  static const SENSITIVE = AdResponseRejectedReasonsEnum._(r'SENSITIVE');
  static const UNACCEPTABLE_BUSINESS = AdResponseRejectedReasonsEnum._(r'UNACCEPTABLE_BUSINESS');
  static const SUSPICIOUS_CLAIMS = AdResponseRejectedReasonsEnum._(r'SUSPICIOUS_CLAIMS');
  static const PHARMA = AdResponseRejectedReasonsEnum._(r'PHARMA');
  static const SUSPICIOUS_SUPPLEMENTS = AdResponseRejectedReasonsEnum._(r'SUSPICIOUS_SUPPLEMENTS');
  static const ILLEGAL_RECREATIONAL_DRUG = AdResponseRejectedReasonsEnum._(r'ILLEGAL_RECREATIONAL_DRUG');
  static const LOW_QUALITY_LANDING_PAGE = AdResponseRejectedReasonsEnum._(r'LOW_QUALITY_LANDING_PAGE');
  static const RESTRICTED_HEALTHCARE = AdResponseRejectedReasonsEnum._(r'RESTRICTED_HEALTHCARE');
  static const INCONSISTENT_LANG_FR = AdResponseRejectedReasonsEnum._(r'INCONSISTENT_LANG_FR');

  /// List of all possible values in this [enum][AdResponseRejectedReasonsEnum].
  static const values = <AdResponseRejectedReasonsEnum>[
    HASHTAGS,
    PROMOTIONS_AND_PRICES,
    TARGETING,
    LANDING_PAGE,
    CAPS_AND_SYMBOLS,
    SHOCKING,
    WEIGHT_LOSS,
    PROHIBITED_PRODUCT,
    AUTHENTICITY,
    NUDITY,
    CONFUSING_DESIGN,
    URGENCY,
    RATINGS,
    APP,
    ALCOHOL,
    CONTESTS,
    POLITICAL,
    OTHER,
    IMAGE,
    NAR,
    INCONSISTENT,
    CLICKBAIT,
    NO_DESCRIPTION,
    LOW_QUALITY,
    EXAGGERATED_CLAIMS,
    PINTEREST_BRAND,
    ALCOHOL_NO_SALE,
    LANDING_PAGE_SPEED,
    LANDING_PAGE_HARDWALL,
    LANDING_PAGE_BROKEN,
    LANDING_PAGE_QUALITY,
    OUT_OF_STOCK,
    IMAGE_LOW_QUALITY,
    IMAGE_BUSY,
    IMAGE_POORLY_EDITED,
    IMAGE_BEFORE_AFTER,
    UGC,
    FAKE_BUTTONS,
    WEAPONS,
    SENSITIVE,
    UNACCEPTABLE_BUSINESS,
    SUSPICIOUS_CLAIMS,
    PHARMA,
    SUSPICIOUS_SUPPLEMENTS,
    ILLEGAL_RECREATIONAL_DRUG,
    LOW_QUALITY_LANDING_PAGE,
    RESTRICTED_HEALTHCARE,
    INCONSISTENT_LANG_FR,
  ];

  static AdResponseRejectedReasonsEnum? fromJson(dynamic value) => AdResponseRejectedReasonsEnumTypeTransformer().decode(value);

  static List<AdResponseRejectedReasonsEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdResponseRejectedReasonsEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdResponseRejectedReasonsEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdResponseRejectedReasonsEnum] to String,
/// and [decode] dynamic data back to [AdResponseRejectedReasonsEnum].
class AdResponseRejectedReasonsEnumTypeTransformer {
  factory AdResponseRejectedReasonsEnumTypeTransformer() => _instance ??= const AdResponseRejectedReasonsEnumTypeTransformer._();

  const AdResponseRejectedReasonsEnumTypeTransformer._();

  String encode(AdResponseRejectedReasonsEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdResponseRejectedReasonsEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdResponseRejectedReasonsEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HASHTAGS': return AdResponseRejectedReasonsEnum.HASHTAGS;
        case r'PROMOTIONS_AND_PRICES': return AdResponseRejectedReasonsEnum.PROMOTIONS_AND_PRICES;
        case r'TARGETING': return AdResponseRejectedReasonsEnum.TARGETING;
        case r'LANDING_PAGE': return AdResponseRejectedReasonsEnum.LANDING_PAGE;
        case r'CAPS_AND_SYMBOLS': return AdResponseRejectedReasonsEnum.CAPS_AND_SYMBOLS;
        case r'SHOCKING': return AdResponseRejectedReasonsEnum.SHOCKING;
        case r'WEIGHT_LOSS': return AdResponseRejectedReasonsEnum.WEIGHT_LOSS;
        case r'PROHIBITED_PRODUCT': return AdResponseRejectedReasonsEnum.PROHIBITED_PRODUCT;
        case r'AUTHENTICITY': return AdResponseRejectedReasonsEnum.AUTHENTICITY;
        case r'NUDITY': return AdResponseRejectedReasonsEnum.NUDITY;
        case r'CONFUSING_DESIGN': return AdResponseRejectedReasonsEnum.CONFUSING_DESIGN;
        case r'URGENCY': return AdResponseRejectedReasonsEnum.URGENCY;
        case r'RATINGS': return AdResponseRejectedReasonsEnum.RATINGS;
        case r'APP': return AdResponseRejectedReasonsEnum.APP;
        case r'ALCOHOL': return AdResponseRejectedReasonsEnum.ALCOHOL;
        case r'CONTESTS': return AdResponseRejectedReasonsEnum.CONTESTS;
        case r'POLITICAL': return AdResponseRejectedReasonsEnum.POLITICAL;
        case r'OTHER': return AdResponseRejectedReasonsEnum.OTHER;
        case r'IMAGE': return AdResponseRejectedReasonsEnum.IMAGE;
        case r'NAR': return AdResponseRejectedReasonsEnum.NAR;
        case r'INCONSISTENT': return AdResponseRejectedReasonsEnum.INCONSISTENT;
        case r'CLICKBAIT': return AdResponseRejectedReasonsEnum.CLICKBAIT;
        case r'NO_DESCRIPTION': return AdResponseRejectedReasonsEnum.NO_DESCRIPTION;
        case r'LOW_QUALITY': return AdResponseRejectedReasonsEnum.LOW_QUALITY;
        case r'EXAGGERATED_CLAIMS': return AdResponseRejectedReasonsEnum.EXAGGERATED_CLAIMS;
        case r'PINTEREST_BRAND': return AdResponseRejectedReasonsEnum.PINTEREST_BRAND;
        case r'ALCOHOL_NO_SALE': return AdResponseRejectedReasonsEnum.ALCOHOL_NO_SALE;
        case r'LANDING_PAGE_SPEED': return AdResponseRejectedReasonsEnum.LANDING_PAGE_SPEED;
        case r'LANDING_PAGE_HARDWALL': return AdResponseRejectedReasonsEnum.LANDING_PAGE_HARDWALL;
        case r'LANDING_PAGE_BROKEN': return AdResponseRejectedReasonsEnum.LANDING_PAGE_BROKEN;
        case r'LANDING_PAGE_QUALITY': return AdResponseRejectedReasonsEnum.LANDING_PAGE_QUALITY;
        case r'OUT_OF_STOCK': return AdResponseRejectedReasonsEnum.OUT_OF_STOCK;
        case r'IMAGE_LOW_QUALITY': return AdResponseRejectedReasonsEnum.IMAGE_LOW_QUALITY;
        case r'IMAGE_BUSY': return AdResponseRejectedReasonsEnum.IMAGE_BUSY;
        case r'IMAGE_POORLY_EDITED': return AdResponseRejectedReasonsEnum.IMAGE_POORLY_EDITED;
        case r'IMAGE_BEFORE_AFTER': return AdResponseRejectedReasonsEnum.IMAGE_BEFORE_AFTER;
        case r'UGC': return AdResponseRejectedReasonsEnum.UGC;
        case r'FAKE_BUTTONS': return AdResponseRejectedReasonsEnum.FAKE_BUTTONS;
        case r'WEAPONS': return AdResponseRejectedReasonsEnum.WEAPONS;
        case r'SENSITIVE': return AdResponseRejectedReasonsEnum.SENSITIVE;
        case r'UNACCEPTABLE_BUSINESS': return AdResponseRejectedReasonsEnum.UNACCEPTABLE_BUSINESS;
        case r'SUSPICIOUS_CLAIMS': return AdResponseRejectedReasonsEnum.SUSPICIOUS_CLAIMS;
        case r'PHARMA': return AdResponseRejectedReasonsEnum.PHARMA;
        case r'SUSPICIOUS_SUPPLEMENTS': return AdResponseRejectedReasonsEnum.SUSPICIOUS_SUPPLEMENTS;
        case r'ILLEGAL_RECREATIONAL_DRUG': return AdResponseRejectedReasonsEnum.ILLEGAL_RECREATIONAL_DRUG;
        case r'LOW_QUALITY_LANDING_PAGE': return AdResponseRejectedReasonsEnum.LOW_QUALITY_LANDING_PAGE;
        case r'RESTRICTED_HEALTHCARE': return AdResponseRejectedReasonsEnum.RESTRICTED_HEALTHCARE;
        case r'INCONSISTENT_LANG_FR': return AdResponseRejectedReasonsEnum.INCONSISTENT_LANG_FR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdResponseRejectedReasonsEnumTypeTransformer] instance.
  static AdResponseRejectedReasonsEnumTypeTransformer? _instance;
}


/// Ad review status
class AdResponseReviewStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const AdResponseReviewStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OTHER = AdResponseReviewStatusEnum._(r'OTHER');
  static const PENDING = AdResponseReviewStatusEnum._(r'PENDING');
  static const REJECTED = AdResponseReviewStatusEnum._(r'REJECTED');
  static const APPROVED = AdResponseReviewStatusEnum._(r'APPROVED');

  /// List of all possible values in this [enum][AdResponseReviewStatusEnum].
  static const values = <AdResponseReviewStatusEnum>[
    OTHER,
    PENDING,
    REJECTED,
    APPROVED,
  ];

  static AdResponseReviewStatusEnum? fromJson(dynamic value) => AdResponseReviewStatusEnumTypeTransformer().decode(value);

  static List<AdResponseReviewStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdResponseReviewStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdResponseReviewStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdResponseReviewStatusEnum] to String,
/// and [decode] dynamic data back to [AdResponseReviewStatusEnum].
class AdResponseReviewStatusEnumTypeTransformer {
  factory AdResponseReviewStatusEnumTypeTransformer() => _instance ??= const AdResponseReviewStatusEnumTypeTransformer._();

  const AdResponseReviewStatusEnumTypeTransformer._();

  String encode(AdResponseReviewStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdResponseReviewStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdResponseReviewStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OTHER': return AdResponseReviewStatusEnum.OTHER;
        case r'PENDING': return AdResponseReviewStatusEnum.PENDING;
        case r'REJECTED': return AdResponseReviewStatusEnum.REJECTED;
        case r'APPROVED': return AdResponseReviewStatusEnum.APPROVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdResponseReviewStatusEnumTypeTransformer] instance.
  static AdResponseReviewStatusEnumTypeTransformer? _instance;
}


