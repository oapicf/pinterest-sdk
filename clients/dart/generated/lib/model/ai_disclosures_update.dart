//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AiDisclosuresUpdate {
  /// Returns a new [AiDisclosuresUpdate] instance.
  AiDisclosuresUpdate({
    this.values = const [],
  });

  /// List of AI disclosure declarations the creator has made about this Pin.
  List<AiDisclosureItem> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AiDisclosuresUpdate &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (values.hashCode);

  @override
  String toString() => 'AiDisclosuresUpdate[values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [AiDisclosuresUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AiDisclosuresUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AiDisclosuresUpdate(
        values: AiDisclosureItem.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<AiDisclosuresUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AiDisclosuresUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AiDisclosuresUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AiDisclosuresUpdate> mapFromJson(dynamic json) {
    final map = <String, AiDisclosuresUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AiDisclosuresUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AiDisclosuresUpdate-objects as value to a dart map
  static Map<String, List<AiDisclosuresUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AiDisclosuresUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AiDisclosuresUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

