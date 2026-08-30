//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdvertiserDefinedEvent {
  /// Returns a new [AdvertiserDefinedEvent] instance.
  AdvertiserDefinedEvent({
    this.mappedConversionType,
    this.name,
  });

  /// Standard type mapped to ADE for optimization
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionTagTypeOptimal? mappedConversionType;

  /// Raw string name of the event, usually logged as raw_event_name in our dataset
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdvertiserDefinedEvent &&
    other.mappedConversionType == mappedConversionType &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mappedConversionType == null ? 0 : mappedConversionType!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'AdvertiserDefinedEvent[mappedConversionType=$mappedConversionType, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mappedConversionType != null) {
      json[r'mapped_conversion_type'] = this.mappedConversionType;
    } else {
      json[r'mapped_conversion_type'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [AdvertiserDefinedEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdvertiserDefinedEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdvertiserDefinedEvent(
        mappedConversionType: ConversionTagTypeOptimal.fromJson(json[r'mapped_conversion_type']),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<AdvertiserDefinedEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvertiserDefinedEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvertiserDefinedEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdvertiserDefinedEvent> mapFromJson(dynamic json) {
    final map = <String, AdvertiserDefinedEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdvertiserDefinedEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdvertiserDefinedEvent-objects as value to a dart map
  static Map<String, List<AdvertiserDefinedEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdvertiserDefinedEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdvertiserDefinedEvent.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

