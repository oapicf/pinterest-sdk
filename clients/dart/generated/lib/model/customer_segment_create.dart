//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerSegmentCreate {
  /// Returns a new [CustomerSegmentCreate] instance.
  CustomerSegmentCreate({
    this.audienceIds = const [],
    required this.name,
  });

  /// Audience IDs included in the customer segment.
  List<String> audienceIds;

  /// Customer segment name.
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerSegmentCreate &&
    _deepEquality.equals(other.audienceIds, audienceIds) &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceIds.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'CustomerSegmentCreate[audienceIds=$audienceIds, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_ids'] = this.audienceIds;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [CustomerSegmentCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerSegmentCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_ids'), 'Required key "CustomerSegmentCreate[audience_ids]" is missing from JSON.');
        assert(json[r'audience_ids'] != null, 'Required key "CustomerSegmentCreate[audience_ids]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CustomerSegmentCreate[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CustomerSegmentCreate[name]" has a null value in JSON.');
        return true;
      }());

      return CustomerSegmentCreate(
        audienceIds: json[r'audience_ids'] is Iterable
            ? (json[r'audience_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CustomerSegmentCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerSegmentCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerSegmentCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerSegmentCreate> mapFromJson(dynamic json) {
    final map = <String, CustomerSegmentCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerSegmentCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerSegmentCreate-objects as value to a dart map
  static Map<String, List<CustomerSegmentCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerSegmentCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerSegmentCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_ids',
    'name',
  };
}

