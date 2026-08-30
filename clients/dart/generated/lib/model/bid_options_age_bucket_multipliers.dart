//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidOptionsAgeBucketMultipliers {
  /// Returns a new [BidOptionsAgeBucketMultipliers] instance.
  BidOptionsAgeBucketMultipliers({
    this.n1824,
    this.n2534,
    this.n3544,
    this.n4549,
    this.n5054,
    this.n5564,
    this.n65plus,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n1824;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n2534;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n3544;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n4549;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n5054;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n5564;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? n65plus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidOptionsAgeBucketMultipliers &&
    other.n1824 == n1824 &&
    other.n2534 == n2534 &&
    other.n3544 == n3544 &&
    other.n4549 == n4549 &&
    other.n5054 == n5054 &&
    other.n5564 == n5564 &&
    other.n65plus == n65plus;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (n1824 == null ? 0 : n1824!.hashCode) +
    (n2534 == null ? 0 : n2534!.hashCode) +
    (n3544 == null ? 0 : n3544!.hashCode) +
    (n4549 == null ? 0 : n4549!.hashCode) +
    (n5054 == null ? 0 : n5054!.hashCode) +
    (n5564 == null ? 0 : n5564!.hashCode) +
    (n65plus == null ? 0 : n65plus!.hashCode);

  @override
  String toString() => 'BidOptionsAgeBucketMultipliers[n1824=$n1824, n2534=$n2534, n3544=$n3544, n4549=$n4549, n5054=$n5054, n5564=$n5564, n65plus=$n65plus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.n1824 != null) {
      json[r'18-24'] = this.n1824;
    } else {
      json[r'18-24'] = null;
    }
    if (this.n2534 != null) {
      json[r'25-34'] = this.n2534;
    } else {
      json[r'25-34'] = null;
    }
    if (this.n3544 != null) {
      json[r'35-44'] = this.n3544;
    } else {
      json[r'35-44'] = null;
    }
    if (this.n4549 != null) {
      json[r'45-49'] = this.n4549;
    } else {
      json[r'45-49'] = null;
    }
    if (this.n5054 != null) {
      json[r'50-54'] = this.n5054;
    } else {
      json[r'50-54'] = null;
    }
    if (this.n5564 != null) {
      json[r'55-64'] = this.n5564;
    } else {
      json[r'55-64'] = null;
    }
    if (this.n65plus != null) {
      json[r'65+'] = this.n65plus;
    } else {
      json[r'65+'] = null;
    }
    return json;
  }

  /// Returns a new [BidOptionsAgeBucketMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidOptionsAgeBucketMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BidOptionsAgeBucketMultipliers(
        n1824: num.parse('${json[r'18-24']}'),
        n2534: num.parse('${json[r'25-34']}'),
        n3544: num.parse('${json[r'35-44']}'),
        n4549: num.parse('${json[r'45-49']}'),
        n5054: num.parse('${json[r'50-54']}'),
        n5564: num.parse('${json[r'55-64']}'),
        n65plus: num.parse('${json[r'65+']}'),
      );
    }
    return null;
  }

  static List<BidOptionsAgeBucketMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidOptionsAgeBucketMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidOptionsAgeBucketMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidOptionsAgeBucketMultipliers> mapFromJson(dynamic json) {
    final map = <String, BidOptionsAgeBucketMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidOptionsAgeBucketMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidOptionsAgeBucketMultipliers-objects as value to a dart map
  static Map<String, List<BidOptionsAgeBucketMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidOptionsAgeBucketMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidOptionsAgeBucketMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

