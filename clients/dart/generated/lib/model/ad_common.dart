//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdCommon {
  /// Returns a new [AdCommon] instance.
  AdCommon({
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

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdCommon &&
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
    (viewTrackingUrl == null ? 0 : viewTrackingUrl!.hashCode);

  @override
  String toString() => 'AdCommon[adGroupId=$adGroupId, androidDeepLink=$androidDeepLink, carouselAndroidDeepLinks=$carouselAndroidDeepLinks, carouselDestinationUrls=$carouselDestinationUrls, carouselIosDeepLinks=$carouselIosDeepLinks, clickTrackingUrl=$clickTrackingUrl, creativeType=$creativeType, customizableCtaType=$customizableCtaType, destinationUrl=$destinationUrl, disclosureType=$disclosureType, disclosureUrl=$disclosureUrl, gridClickType=$gridClickType, iosDeepLink=$iosDeepLink, isPinDeleted=$isPinDeleted, isRemovable=$isRemovable, leadFormId=$leadFormId, name=$name, quizPinData=$quizPinData, status=$status, trackingUrls=$trackingUrls, viewTrackingUrl=$viewTrackingUrl]';

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
    return json;
  }

  /// Returns a new [AdCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdCommon(
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
      );
    }
    return null;
  }

  static List<AdCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdCommon> mapFromJson(dynamic json) {
    final map = <String, AdCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdCommon-objects as value to a dart map
  static Map<String, List<AdCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

