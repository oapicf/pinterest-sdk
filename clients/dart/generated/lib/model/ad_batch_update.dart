//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdBatchUpdate {
  /// Returns a new [AdBatchUpdate] instance.
  AdBatchUpdate({
    this.adGroupId,
    this.androidDeepLink,
    this.carouselAndroidDeepLinks = const [],
    this.carouselDestinationUrls = const [],
    this.carouselIosDeepLinks = const [],
    this.clickTrackingUrl,
    this.collectionItemsDestinationUrlTemplate,
    this.collectionsHeaderType,
    this.creativeType,
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
    this.pinId,
    this.quizPinData,
    this.status,
    this.trackingUrls,
    this.viewTrackingUrl,
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

  /// Destination URL template for all items within a collections drawer.
  String? collectionItemsDestinationUrlTemplate;

  AdCollectionsHeaderType? collectionsHeaderType;

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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pinId;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdBatchUpdate &&
    other.adGroupId == adGroupId &&
    other.androidDeepLink == androidDeepLink &&
    _deepEquality.equals(other.carouselAndroidDeepLinks, carouselAndroidDeepLinks) &&
    _deepEquality.equals(other.carouselDestinationUrls, carouselDestinationUrls) &&
    _deepEquality.equals(other.carouselIosDeepLinks, carouselIosDeepLinks) &&
    other.clickTrackingUrl == clickTrackingUrl &&
    other.collectionItemsDestinationUrlTemplate == collectionItemsDestinationUrlTemplate &&
    other.collectionsHeaderType == collectionsHeaderType &&
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
    other.status == status &&
    other.trackingUrls == trackingUrls &&
    other.viewTrackingUrl == viewTrackingUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupId == null ? 0 : adGroupId!.hashCode) +
    (androidDeepLink == null ? 0 : androidDeepLink!.hashCode) +
    (carouselAndroidDeepLinks == null ? 0 : carouselAndroidDeepLinks!.hashCode) +
    (carouselDestinationUrls == null ? 0 : carouselDestinationUrls!.hashCode) +
    (carouselIosDeepLinks == null ? 0 : carouselIosDeepLinks!.hashCode) +
    (clickTrackingUrl == null ? 0 : clickTrackingUrl!.hashCode) +
    (collectionItemsDestinationUrlTemplate == null ? 0 : collectionItemsDestinationUrlTemplate!.hashCode) +
    (collectionsHeaderType == null ? 0 : collectionsHeaderType!.hashCode) +
    (creativeType == null ? 0 : creativeType!.hashCode) +
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
    (pinId == null ? 0 : pinId!.hashCode) +
    (quizPinData == null ? 0 : quizPinData!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (viewTrackingUrl == null ? 0 : viewTrackingUrl!.hashCode);

  @override
  String toString() => 'AdBatchUpdate[adGroupId=$adGroupId, androidDeepLink=$androidDeepLink, carouselAndroidDeepLinks=$carouselAndroidDeepLinks, carouselDestinationUrls=$carouselDestinationUrls, carouselIosDeepLinks=$carouselIosDeepLinks, clickTrackingUrl=$clickTrackingUrl, collectionItemsDestinationUrlTemplate=$collectionItemsDestinationUrlTemplate, collectionsHeaderType=$collectionsHeaderType, creativeType=$creativeType, customizableCtaType=$customizableCtaType, destinationUrl=$destinationUrl, disclosureType=$disclosureType, disclosureUrl=$disclosureUrl, gridClickType=$gridClickType, id=$id, iosDeepLink=$iosDeepLink, isCarting=$isCarting, isCollageAcceptedTerms=$isCollageAcceptedTerms, isCollageSingleDestination=$isCollageSingleDestination, isPinDeleted=$isPinDeleted, isRemovable=$isRemovable, leadFormId=$leadFormId, name=$name, pinId=$pinId, quizPinData=$quizPinData, status=$status, trackingUrls=$trackingUrls, viewTrackingUrl=$viewTrackingUrl]';

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
    if (this.pinId != null) {
      json[r'pin_id'] = this.pinId;
    } else {
      json[r'pin_id'] = null;
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
    return json;
  }

  /// Returns a new [AdBatchUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdBatchUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "AdBatchUpdate[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AdBatchUpdate[id]" has a null value in JSON.');
        return true;
      }());

      return AdBatchUpdate(
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
        collectionItemsDestinationUrlTemplate: mapValueOfType<String>(json, r'collection_items_destination_url_template'),
        collectionsHeaderType: AdCollectionsHeaderType.fromJson(json[r'collections_header_type']),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
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
        pinId: mapValueOfType<String>(json, r'pin_id'),
        quizPinData: QuizPinData.fromJson(json[r'quiz_pin_data']),
        status: EntityStatus.fromJson(json[r'status']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        viewTrackingUrl: mapValueOfType<String>(json, r'view_tracking_url'),
      );
    }
    return null;
  }

  static List<AdBatchUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdBatchUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdBatchUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdBatchUpdate> mapFromJson(dynamic json) {
    final map = <String, AdBatchUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdBatchUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdBatchUpdate-objects as value to a dart map
  static Map<String, List<AdBatchUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdBatchUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdBatchUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

