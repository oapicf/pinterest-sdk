//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventsDataInnerCustomData {
  /// Returns a new [ConversionEventsDataInnerCustomData] instance.
  ConversionEventsDataInnerCustomData({
    this.contentBrand,
    this.contentCategory,
    this.contentIds = const [],
    this.contentName,
    this.contents = const [],
    this.currency,
    this.externalMeasurementId,
    this.externalMeasurementVendorId,
    this.np,
    this.numItems,
    this.optOutType,
    this.orderId,
    this.predictedLtv,
    this.searchString,
    this.value,
  });

  /// The brand of the content associated with the event.
  String? contentBrand;

  /// The category of the content associated with the event.
  String? contentCategory;

  /// List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  List<String> contentIds;

  /// The name of the page or product associated with the event.
  String? contentName;

  /// A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  List<ConversionEventsDataInnerCustomDataContentsInner> contents;

  /// The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  String? currency;

  /// Only use when instructed.
  String? externalMeasurementId;

  /// Only use when instructed.
  int? externalMeasurementVendorId;

  /// Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  String? np;

  /// Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? numItems;

  /// Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
  String? optOutType;

  /// The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  String? orderId;

  /// Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
  String? predictedLtv;

  /// The search string related to the user conversion event.
  String? searchString;

  /// Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventsDataInnerCustomData &&
    other.contentBrand == contentBrand &&
    other.contentCategory == contentCategory &&
    _deepEquality.equals(other.contentIds, contentIds) &&
    other.contentName == contentName &&
    _deepEquality.equals(other.contents, contents) &&
    other.currency == currency &&
    other.externalMeasurementId == externalMeasurementId &&
    other.externalMeasurementVendorId == externalMeasurementVendorId &&
    other.np == np &&
    other.numItems == numItems &&
    other.optOutType == optOutType &&
    other.orderId == orderId &&
    other.predictedLtv == predictedLtv &&
    other.searchString == searchString &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentBrand == null ? 0 : contentBrand!.hashCode) +
    (contentCategory == null ? 0 : contentCategory!.hashCode) +
    (contentIds.hashCode) +
    (contentName == null ? 0 : contentName!.hashCode) +
    (contents.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (externalMeasurementId == null ? 0 : externalMeasurementId!.hashCode) +
    (externalMeasurementVendorId == null ? 0 : externalMeasurementVendorId!.hashCode) +
    (np == null ? 0 : np!.hashCode) +
    (numItems == null ? 0 : numItems!.hashCode) +
    (optOutType == null ? 0 : optOutType!.hashCode) +
    (orderId == null ? 0 : orderId!.hashCode) +
    (predictedLtv == null ? 0 : predictedLtv!.hashCode) +
    (searchString == null ? 0 : searchString!.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'ConversionEventsDataInnerCustomData[contentBrand=$contentBrand, contentCategory=$contentCategory, contentIds=$contentIds, contentName=$contentName, contents=$contents, currency=$currency, externalMeasurementId=$externalMeasurementId, externalMeasurementVendorId=$externalMeasurementVendorId, np=$np, numItems=$numItems, optOutType=$optOutType, orderId=$orderId, predictedLtv=$predictedLtv, searchString=$searchString, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.contentBrand != null) {
      json[r'content_brand'] = this.contentBrand;
    } else {
      json[r'content_brand'] = null;
    }
    if (this.contentCategory != null) {
      json[r'content_category'] = this.contentCategory;
    } else {
      json[r'content_category'] = null;
    }
      json[r'content_ids'] = this.contentIds;
    if (this.contentName != null) {
      json[r'content_name'] = this.contentName;
    } else {
      json[r'content_name'] = null;
    }
      json[r'contents'] = this.contents;
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.externalMeasurementId != null) {
      json[r'external_measurement_id'] = this.externalMeasurementId;
    } else {
      json[r'external_measurement_id'] = null;
    }
    if (this.externalMeasurementVendorId != null) {
      json[r'external_measurement_vendor_id'] = this.externalMeasurementVendorId;
    } else {
      json[r'external_measurement_vendor_id'] = null;
    }
    if (this.np != null) {
      json[r'np'] = this.np;
    } else {
      json[r'np'] = null;
    }
    if (this.numItems != null) {
      json[r'num_items'] = this.numItems;
    } else {
      json[r'num_items'] = null;
    }
    if (this.optOutType != null) {
      json[r'opt_out_type'] = this.optOutType;
    } else {
      json[r'opt_out_type'] = null;
    }
    if (this.orderId != null) {
      json[r'order_id'] = this.orderId;
    } else {
      json[r'order_id'] = null;
    }
    if (this.predictedLtv != null) {
      json[r'predicted_ltv'] = this.predictedLtv;
    } else {
      json[r'predicted_ltv'] = null;
    }
    if (this.searchString != null) {
      json[r'search_string'] = this.searchString;
    } else {
      json[r'search_string'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventsDataInnerCustomData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventsDataInnerCustomData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventsDataInnerCustomData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventsDataInnerCustomData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventsDataInnerCustomData(
        contentBrand: mapValueOfType<String>(json, r'content_brand'),
        contentCategory: mapValueOfType<String>(json, r'content_category'),
        contentIds: json[r'content_ids'] is Iterable
            ? (json[r'content_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        contentName: mapValueOfType<String>(json, r'content_name'),
        contents: ConversionEventsDataInnerCustomDataContentsInner.listFromJson(json[r'contents']),
        currency: mapValueOfType<String>(json, r'currency'),
        externalMeasurementId: mapValueOfType<String>(json, r'external_measurement_id'),
        externalMeasurementVendorId: mapValueOfType<int>(json, r'external_measurement_vendor_id'),
        np: mapValueOfType<String>(json, r'np'),
        numItems: mapValueOfType<int>(json, r'num_items'),
        optOutType: mapValueOfType<String>(json, r'opt_out_type'),
        orderId: mapValueOfType<String>(json, r'order_id'),
        predictedLtv: mapValueOfType<String>(json, r'predicted_ltv'),
        searchString: mapValueOfType<String>(json, r'search_string'),
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<ConversionEventsDataInnerCustomData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventsDataInnerCustomData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventsDataInnerCustomData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventsDataInnerCustomData> mapFromJson(dynamic json) {
    final map = <String, ConversionEventsDataInnerCustomData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventsDataInnerCustomData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventsDataInnerCustomData-objects as value to a dart map
  static Map<String, List<ConversionEventsDataInnerCustomData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventsDataInnerCustomData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventsDataInnerCustomData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

