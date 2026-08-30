//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupDeliveryEstimatesKeywordsItems {
  /// Returns a new [AdGroupDeliveryEstimatesKeywordsItems] instance.
  AdGroupDeliveryEstimatesKeywordsItems({
    required this.matchType,
    required this.value,
  });

  NullalbleMatchType? matchType;

  /// Keyword value (120 chars max).
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupDeliveryEstimatesKeywordsItems &&
    other.matchType == matchType &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (matchType == null ? 0 : matchType!.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'AdGroupDeliveryEstimatesKeywordsItems[matchType=$matchType, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.matchType != null) {
      json[r'match_type'] = this.matchType;
    } else {
      json[r'match_type'] = null;
    }
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [AdGroupDeliveryEstimatesKeywordsItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupDeliveryEstimatesKeywordsItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'match_type'), 'Required key "AdGroupDeliveryEstimatesKeywordsItems[match_type]" is missing from JSON.');
        assert(json.containsKey(r'value'), 'Required key "AdGroupDeliveryEstimatesKeywordsItems[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "AdGroupDeliveryEstimatesKeywordsItems[value]" has a null value in JSON.');
        return true;
      }());

      return AdGroupDeliveryEstimatesKeywordsItems(
        matchType: NullalbleMatchType.fromJson(json[r'match_type']),
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<AdGroupDeliveryEstimatesKeywordsItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupDeliveryEstimatesKeywordsItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupDeliveryEstimatesKeywordsItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupDeliveryEstimatesKeywordsItems> mapFromJson(dynamic json) {
    final map = <String, AdGroupDeliveryEstimatesKeywordsItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupDeliveryEstimatesKeywordsItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupDeliveryEstimatesKeywordsItems-objects as value to a dart map
  static Map<String, List<AdGroupDeliveryEstimatesKeywordsItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupDeliveryEstimatesKeywordsItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupDeliveryEstimatesKeywordsItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'match_type',
    'value',
  };
}

