//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AudienceDemographics {
  /// Returns a new [AudienceDemographics] instance.
  AudienceDemographics({
    this.ages = const [],
    this.countries = const [],
    this.devices = const [],
    this.genders = const [],
    this.metros = const [],
  });

  /// Ages distribution.
  List<AudienceDemographicValue> ages;

  /// Country area distribution.
  List<AudienceDemographicValue> countries;

  /// Device usage distribution.
  List<AudienceDemographicValue> devices;

  /// Gender distribution.
  List<AudienceDemographicValue> genders;

  /// Geographic metro area distribution.
  List<AudienceDemographicValue> metros;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AudienceDemographics &&
    _deepEquality.equals(other.ages, ages) &&
    _deepEquality.equals(other.countries, countries) &&
    _deepEquality.equals(other.devices, devices) &&
    _deepEquality.equals(other.genders, genders) &&
    _deepEquality.equals(other.metros, metros);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ages.hashCode) +
    (countries.hashCode) +
    (devices.hashCode) +
    (genders.hashCode) +
    (metros.hashCode);

  @override
  String toString() => 'AudienceDemographics[ages=$ages, countries=$countries, devices=$devices, genders=$genders, metros=$metros]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ages'] = this.ages;
      json[r'countries'] = this.countries;
      json[r'devices'] = this.devices;
      json[r'genders'] = this.genders;
      json[r'metros'] = this.metros;
    return json;
  }

  /// Returns a new [AudienceDemographics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AudienceDemographics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AudienceDemographics[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AudienceDemographics[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AudienceDemographics(
        ages: AudienceDemographicValue.listFromJson(json[r'ages']),
        countries: AudienceDemographicValue.listFromJson(json[r'countries']),
        devices: AudienceDemographicValue.listFromJson(json[r'devices']),
        genders: AudienceDemographicValue.listFromJson(json[r'genders']),
        metros: AudienceDemographicValue.listFromJson(json[r'metros']),
      );
    }
    return null;
  }

  static List<AudienceDemographics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceDemographics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceDemographics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AudienceDemographics> mapFromJson(dynamic json) {
    final map = <String, AudienceDemographics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AudienceDemographics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AudienceDemographics-objects as value to a dart map
  static Map<String, List<AudienceDemographics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AudienceDemographics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AudienceDemographics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

