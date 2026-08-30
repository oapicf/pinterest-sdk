//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidFloorCreate {
  /// Returns a new [BidFloorCreate] instance.
  BidFloorCreate({
    this.bidFloorSpecs = const [],
    this.targetingSpec,
  });

  /// List of bid floor specifications.
  List<BidFloorSpec> bidFloorSpecs;

  /// Ad group targeting specification defining the ad group target audience.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecOptimal? targetingSpec;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidFloorCreate &&
    _deepEquality.equals(other.bidFloorSpecs, bidFloorSpecs) &&
    other.targetingSpec == targetingSpec;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidFloorSpecs.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode);

  @override
  String toString() => 'BidFloorCreate[bidFloorSpecs=$bidFloorSpecs, targetingSpec=$targetingSpec]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bid_floor_specs'] = this.bidFloorSpecs;
    if (this.targetingSpec != null) {
      json[r'targeting_spec'] = this.targetingSpec;
    } else {
      json[r'targeting_spec'] = null;
    }
    return json;
  }

  /// Returns a new [BidFloorCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidFloorCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'bid_floor_specs'), 'Required key "BidFloorCreate[bid_floor_specs]" is missing from JSON.');
        assert(json[r'bid_floor_specs'] != null, 'Required key "BidFloorCreate[bid_floor_specs]" has a null value in JSON.');
        return true;
      }());

      return BidFloorCreate(
        bidFloorSpecs: BidFloorSpec.listFromJson(json[r'bid_floor_specs']),
        targetingSpec: TargetingSpecOptimal.fromJson(json[r'targeting_spec']),
      );
    }
    return null;
  }

  static List<BidFloorCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidFloorCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidFloorCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidFloorCreate> mapFromJson(dynamic json) {
    final map = <String, BidFloorCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidFloorCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidFloorCreate-objects as value to a dart map
  static Map<String, List<BidFloorCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidFloorCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidFloorCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'bid_floor_specs',
  };
}

