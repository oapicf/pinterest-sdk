//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EventData {
  /// Returns a new [EventData] instance.
  EventData({
    this.currency,
    this.leadType,
    this.lineItems,
    this.orderId,
    this.orderQuantity,
    this.pageName,
    this.promoCode,
    this.property,
    this.searchQuery,
    this.value,
    this.videoTitle,
  });

  /// Currency. For example, 'USD'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currency;

  /// Promotion code. For example, 'Newsletter'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? leadType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LineItem? lineItems;

  /// Order ID. For example, 'X-151481'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? orderId;

  /// Order quantity. For example, 1.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? orderQuantity;

  /// Page name. For example, 'Our Favorite Pins on Pinterest'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pageName;

  /// Promotion code. For example, 'WINTER10'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? promoCode;

  /// Property. For example, 'Athleta'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? property;

  /// Search query string. For example, 'boots'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? searchQuery;

  /// Product value. For example, '199.98'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  /// Video title. For example, 'How to style your Parker Boots'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? videoTitle;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EventData &&
    other.currency == currency &&
    other.leadType == leadType &&
    other.lineItems == lineItems &&
    other.orderId == orderId &&
    other.orderQuantity == orderQuantity &&
    other.pageName == pageName &&
    other.promoCode == promoCode &&
    other.property == property &&
    other.searchQuery == searchQuery &&
    other.value == value &&
    other.videoTitle == videoTitle;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (currency == null ? 0 : currency!.hashCode) +
    (leadType == null ? 0 : leadType!.hashCode) +
    (lineItems == null ? 0 : lineItems!.hashCode) +
    (orderId == null ? 0 : orderId!.hashCode) +
    (orderQuantity == null ? 0 : orderQuantity!.hashCode) +
    (pageName == null ? 0 : pageName!.hashCode) +
    (promoCode == null ? 0 : promoCode!.hashCode) +
    (property == null ? 0 : property!.hashCode) +
    (searchQuery == null ? 0 : searchQuery!.hashCode) +
    (value == null ? 0 : value!.hashCode) +
    (videoTitle == null ? 0 : videoTitle!.hashCode);

  @override
  String toString() => 'EventData[currency=$currency, leadType=$leadType, lineItems=$lineItems, orderId=$orderId, orderQuantity=$orderQuantity, pageName=$pageName, promoCode=$promoCode, property=$property, searchQuery=$searchQuery, value=$value, videoTitle=$videoTitle]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.leadType != null) {
      json[r'lead_type'] = this.leadType;
    } else {
      json[r'lead_type'] = null;
    }
    if (this.lineItems != null) {
      json[r'line_items'] = this.lineItems;
    } else {
      json[r'line_items'] = null;
    }
    if (this.orderId != null) {
      json[r'order_id'] = this.orderId;
    } else {
      json[r'order_id'] = null;
    }
    if (this.orderQuantity != null) {
      json[r'order_quantity'] = this.orderQuantity;
    } else {
      json[r'order_quantity'] = null;
    }
    if (this.pageName != null) {
      json[r'page_name'] = this.pageName;
    } else {
      json[r'page_name'] = null;
    }
    if (this.promoCode != null) {
      json[r'promo_code'] = this.promoCode;
    } else {
      json[r'promo_code'] = null;
    }
    if (this.property != null) {
      json[r'property'] = this.property;
    } else {
      json[r'property'] = null;
    }
    if (this.searchQuery != null) {
      json[r'search_query'] = this.searchQuery;
    } else {
      json[r'search_query'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.videoTitle != null) {
      json[r'video_title'] = this.videoTitle;
    } else {
      json[r'video_title'] = null;
    }
    return json;
  }

  /// Returns a new [EventData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EventData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EventData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EventData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EventData(
        currency: Currency.fromJson(json[r'currency']),
        leadType: mapValueOfType<String>(json, r'lead_type'),
        lineItems: LineItem.fromJson(json[r'line_items']),
        orderId: mapValueOfType<String>(json, r'order_id'),
        orderQuantity: mapValueOfType<int>(json, r'order_quantity'),
        pageName: mapValueOfType<String>(json, r'page_name'),
        promoCode: mapValueOfType<String>(json, r'promo_code'),
        property: mapValueOfType<String>(json, r'property'),
        searchQuery: mapValueOfType<String>(json, r'search_query'),
        value: mapValueOfType<String>(json, r'value'),
        videoTitle: mapValueOfType<String>(json, r'video_title'),
      );
    }
    return null;
  }

  static List<EventData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EventData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EventData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EventData> mapFromJson(dynamic json) {
    final map = <String, EventData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EventData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EventData-objects as value to a dart map
  static Map<String, List<EventData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EventData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EventData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

