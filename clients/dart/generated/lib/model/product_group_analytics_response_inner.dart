//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductGroupAnalyticsResponseInner {
  /// Returns a new [ProductGroupAnalyticsResponseInner] instance.
  ProductGroupAnalyticsResponseInner({
    this.DATE,
    required this.PRODUCT_GROUP_ID,
  });

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? DATE;

  /// The ID of the product group that this metrics belongs to.
  String PRODUCT_GROUP_ID;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductGroupAnalyticsResponseInner &&
    other.DATE == DATE &&
    other.PRODUCT_GROUP_ID == PRODUCT_GROUP_ID;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (DATE == null ? 0 : DATE!.hashCode) +
    (PRODUCT_GROUP_ID.hashCode);

  @override
  String toString() => 'ProductGroupAnalyticsResponseInner[DATE=$DATE, PRODUCT_GROUP_ID=$PRODUCT_GROUP_ID]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.DATE != null) {
      json[r'DATE'] = _dateFormatter.format(this.DATE!.toUtc());
    } else {
      json[r'DATE'] = null;
    }
      json[r'PRODUCT_GROUP_ID'] = this.PRODUCT_GROUP_ID;
    return json;
  }

  /// Returns a new [ProductGroupAnalyticsResponseInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductGroupAnalyticsResponseInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProductGroupAnalyticsResponseInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProductGroupAnalyticsResponseInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProductGroupAnalyticsResponseInner(
        DATE: mapDateTime(json, r'DATE', r''),
        PRODUCT_GROUP_ID: mapValueOfType<String>(json, r'PRODUCT_GROUP_ID')!,
      );
    }
    return null;
  }

  static List<ProductGroupAnalyticsResponseInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupAnalyticsResponseInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupAnalyticsResponseInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductGroupAnalyticsResponseInner> mapFromJson(dynamic json) {
    final map = <String, ProductGroupAnalyticsResponseInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductGroupAnalyticsResponseInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductGroupAnalyticsResponseInner-objects as value to a dart map
  static Map<String, List<ProductGroupAnalyticsResponseInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductGroupAnalyticsResponseInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductGroupAnalyticsResponseInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PRODUCT_GROUP_ID',
  };
}

