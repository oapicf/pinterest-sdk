//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvertiserDefinedEventInput {
  /// Returns a new [AdvertiserDefinedEventInput] instance.
  AdvertiserDefinedEventInput({
    required this.mappedConversionType,
    required this.name,
  });

  /// Pinterest standard event type to map this custom event to for campaign optimization and reporting
  AdvertiserDefinedEventMappingType mappedConversionType;

  /// Raw string name of the event
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvertiserDefinedEventInput &&
    other.mappedConversionType == mappedConversionType &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mappedConversionType.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'AdvertiserDefinedEventInput[mappedConversionType=$mappedConversionType, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'mapped_conversion_type'] = this.mappedConversionType;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [AdvertiserDefinedEventInput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvertiserDefinedEventInput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'mapped_conversion_type'), 'Required key "AdvertiserDefinedEventInput[mapped_conversion_type]" is missing from JSON.');
        assert(json[r'mapped_conversion_type'] != null, 'Required key "AdvertiserDefinedEventInput[mapped_conversion_type]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "AdvertiserDefinedEventInput[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "AdvertiserDefinedEventInput[name]" has a null value in JSON.');
        return true;
      }());

      return AdvertiserDefinedEventInput(
        mappedConversionType: AdvertiserDefinedEventMappingType.fromJson(json[r'mapped_conversion_type'])!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<AdvertiserDefinedEventInput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvertiserDefinedEventInput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvertiserDefinedEventInput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvertiserDefinedEventInput> mapFromJson(dynamic json) {
    final map = <String, AdvertiserDefinedEventInput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvertiserDefinedEventInput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvertiserDefinedEventInput-objects as value to a dart map
  static Map<String, List<AdvertiserDefinedEventInput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvertiserDefinedEventInput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvertiserDefinedEventInput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'mapped_conversion_type',
    'name',
  };
}

