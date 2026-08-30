//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsCreditRedeemCreate {
  /// Returns a new [AdsCreditRedeemCreate] instance.
  AdsCreditRedeemCreate({
    required this.offerCodeHash,
    required this.validateOnly,
  });

  /// Takes in a SHA256 hash of the offerCode.
  String offerCodeHash;

  /// If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
  bool validateOnly;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsCreditRedeemCreate &&
    other.offerCodeHash == offerCodeHash &&
    other.validateOnly == validateOnly;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offerCodeHash.hashCode) +
    (validateOnly.hashCode);

  @override
  String toString() => 'AdsCreditRedeemCreate[offerCodeHash=$offerCodeHash, validateOnly=$validateOnly]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'offerCodeHash'] = this.offerCodeHash;
      json[r'validateOnly'] = this.validateOnly;
    return json;
  }

  /// Returns a new [AdsCreditRedeemCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsCreditRedeemCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'offerCodeHash'), 'Required key "AdsCreditRedeemCreate[offerCodeHash]" is missing from JSON.');
        assert(json[r'offerCodeHash'] != null, 'Required key "AdsCreditRedeemCreate[offerCodeHash]" has a null value in JSON.');
        assert(json.containsKey(r'validateOnly'), 'Required key "AdsCreditRedeemCreate[validateOnly]" is missing from JSON.');
        assert(json[r'validateOnly'] != null, 'Required key "AdsCreditRedeemCreate[validateOnly]" has a null value in JSON.');
        return true;
      }());

      return AdsCreditRedeemCreate(
        offerCodeHash: mapValueOfType<String>(json, r'offerCodeHash')!,
        validateOnly: mapValueOfType<bool>(json, r'validateOnly')!,
      );
    }
    return null;
  }

  static List<AdsCreditRedeemCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditRedeemCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditRedeemCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsCreditRedeemCreate> mapFromJson(dynamic json) {
    final map = <String, AdsCreditRedeemCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsCreditRedeemCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsCreditRedeemCreate-objects as value to a dart map
  static Map<String, List<AdsCreditRedeemCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsCreditRedeemCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsCreditRedeemCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'offerCodeHash',
    'validateOnly',
  };
}

