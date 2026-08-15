//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupIdFilter {
  /// Returns a new [AdGroupIdFilter] instance.
  AdGroupIdFilter({
    this.adGroupIds = const [],
  });

  /// List of ad group ids
  List<String> adGroupIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupIdFilter &&
    _deepEquality.equals(other.adGroupIds, adGroupIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupIds.hashCode);

  @override
  String toString() => 'AdGroupIdFilter[adGroupIds=$adGroupIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_ids'] = this.adGroupIds;
    return json;
  }

  /// Returns a new [AdGroupIdFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupIdFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdGroupIdFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdGroupIdFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdGroupIdFilter(
        adGroupIds: json[r'ad_group_ids'] is Iterable
            ? (json[r'ad_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AdGroupIdFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupIdFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupIdFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupIdFilter> mapFromJson(dynamic json) {
    final map = <String, AdGroupIdFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupIdFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupIdFilter-objects as value to a dart map
  static Map<String, List<AdGroupIdFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupIdFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupIdFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

