//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidOptionsAudienceMultipliers {
  /// Returns a new [BidOptionsAudienceMultipliers] instance.
  BidOptionsAudienceMultipliers({
    required this.audienceId,
    required this.multiplier,
  });

  String audienceId;

  num multiplier;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidOptionsAudienceMultipliers &&
    other.audienceId == audienceId &&
    other.multiplier == multiplier;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId.hashCode) +
    (multiplier.hashCode);

  @override
  String toString() => 'BidOptionsAudienceMultipliers[audienceId=$audienceId, multiplier=$multiplier]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_id'] = this.audienceId;
      json[r'multiplier'] = this.multiplier;
    return json;
  }

  /// Returns a new [BidOptionsAudienceMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidOptionsAudienceMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_id'), 'Required key "BidOptionsAudienceMultipliers[audience_id]" is missing from JSON.');
        assert(json[r'audience_id'] != null, 'Required key "BidOptionsAudienceMultipliers[audience_id]" has a null value in JSON.');
        assert(json.containsKey(r'multiplier'), 'Required key "BidOptionsAudienceMultipliers[multiplier]" is missing from JSON.');
        assert(json[r'multiplier'] != null, 'Required key "BidOptionsAudienceMultipliers[multiplier]" has a null value in JSON.');
        return true;
      }());

      return BidOptionsAudienceMultipliers(
        audienceId: mapValueOfType<String>(json, r'audience_id')!,
        multiplier: num.parse('${json[r'multiplier']}'),
      );
    }
    return null;
  }

  static List<BidOptionsAudienceMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidOptionsAudienceMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidOptionsAudienceMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidOptionsAudienceMultipliers> mapFromJson(dynamic json) {
    final map = <String, BidOptionsAudienceMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidOptionsAudienceMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidOptionsAudienceMultipliers-objects as value to a dart map
  static Map<String, List<BidOptionsAudienceMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidOptionsAudienceMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidOptionsAudienceMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_id',
    'multiplier',
  };
}

