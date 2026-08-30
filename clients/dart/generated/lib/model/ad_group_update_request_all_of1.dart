//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupUpdateRequestAllOf1 {
  /// Returns a new [AdGroupUpdateRequestAllOf1] instance.
  AdGroupUpdateRequestAllOf1({
    this.bidMultiplier,
    required this.id,
    this.targetingSpecOperations = const [],
  });

  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  ///
  /// Minimum value: 0
  /// Maximum value: 10
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? bidMultiplier;

  /// Ad group ID.
  String id;

  /// <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
  List<TargetingSpecOperations> targetingSpecOperations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupUpdateRequestAllOf1 &&
    other.bidMultiplier == bidMultiplier &&
    other.id == id &&
    _deepEquality.equals(other.targetingSpecOperations, targetingSpecOperations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidMultiplier == null ? 0 : bidMultiplier!.hashCode) +
    (id.hashCode) +
    (targetingSpecOperations.hashCode);

  @override
  String toString() => 'AdGroupUpdateRequestAllOf1[bidMultiplier=$bidMultiplier, id=$id, targetingSpecOperations=$targetingSpecOperations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bidMultiplier != null) {
      json[r'bid_multiplier'] = this.bidMultiplier;
    } else {
      json[r'bid_multiplier'] = null;
    }
      json[r'id'] = this.id;
      json[r'targeting_spec_operations'] = this.targetingSpecOperations;
    return json;
  }

  /// Returns a new [AdGroupUpdateRequestAllOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupUpdateRequestAllOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "AdGroupUpdateRequestAllOf1[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AdGroupUpdateRequestAllOf1[id]" has a null value in JSON.');
        return true;
      }());

      return AdGroupUpdateRequestAllOf1(
        bidMultiplier: num.parse('${json[r'bid_multiplier']}'),
        id: mapValueOfType<String>(json, r'id')!,
        targetingSpecOperations: TargetingSpecOperations.listFromJson(json[r'targeting_spec_operations']),
      );
    }
    return null;
  }

  static List<AdGroupUpdateRequestAllOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupUpdateRequestAllOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupUpdateRequestAllOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupUpdateRequestAllOf1> mapFromJson(dynamic json) {
    final map = <String, AdGroupUpdateRequestAllOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupUpdateRequestAllOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupUpdateRequestAllOf1-objects as value to a dart map
  static Map<String, List<AdGroupUpdateRequestAllOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupUpdateRequestAllOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupUpdateRequestAllOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

