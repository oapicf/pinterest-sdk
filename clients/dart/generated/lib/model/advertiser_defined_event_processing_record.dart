//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvertiserDefinedEventProcessingRecord {
  /// Returns a new [AdvertiserDefinedEventProcessingRecord] instance.
  AdvertiserDefinedEventProcessingRecord({
    this.exceptions = const [],
    required this.name,
    required this.status,
  });

  /// List of exception messages if the operation failed
  List<String> exceptions;

  /// Name of the advertiser defined event
  String name;

  /// Processing status (success or failure)
  String status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvertiserDefinedEventProcessingRecord &&
    _deepEquality.equals(other.exceptions, exceptions) &&
    other.name == name &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exceptions.hashCode) +
    (name.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'AdvertiserDefinedEventProcessingRecord[exceptions=$exceptions, name=$name, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'exceptions'] = this.exceptions;
      json[r'name'] = this.name;
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [AdvertiserDefinedEventProcessingRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvertiserDefinedEventProcessingRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "AdvertiserDefinedEventProcessingRecord[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "AdvertiserDefinedEventProcessingRecord[name]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "AdvertiserDefinedEventProcessingRecord[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "AdvertiserDefinedEventProcessingRecord[status]" has a null value in JSON.');
        return true;
      }());

      return AdvertiserDefinedEventProcessingRecord(
        exceptions: json[r'exceptions'] is Iterable
            ? (json[r'exceptions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        name: mapValueOfType<String>(json, r'name')!,
        status: mapValueOfType<String>(json, r'status')!,
      );
    }
    return null;
  }

  static List<AdvertiserDefinedEventProcessingRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvertiserDefinedEventProcessingRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvertiserDefinedEventProcessingRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvertiserDefinedEventProcessingRecord> mapFromJson(dynamic json) {
    final map = <String, AdvertiserDefinedEventProcessingRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvertiserDefinedEventProcessingRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvertiserDefinedEventProcessingRecord-objects as value to a dart map
  static Map<String, List<AdvertiserDefinedEventProcessingRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvertiserDefinedEventProcessingRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvertiserDefinedEventProcessingRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'status',
  };
}

