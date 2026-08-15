//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BidFloor {
  /// Returns a new [BidFloor] instance.
  BidFloor({
    this.bidFloors = const [],
    this.type = 'bidfloor',
  });

  /// A list of bid floors in micro currency. For example, [100000, 200000]
  List<int> bidFloors;

  /// Always the string 'bidfloor'
  String type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BidFloor &&
    _deepEquality.equals(other.bidFloors, bidFloors) &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidFloors.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'BidFloor[bidFloors=$bidFloors, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'bid_floors'] = this.bidFloors;
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [BidFloor] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BidFloor? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BidFloor[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BidFloor[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BidFloor(
        bidFloors: json[r'bid_floors'] is Iterable
            ? (json[r'bid_floors'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        type: mapValueOfType<String>(json, r'type') ?? 'bidfloor',
      );
    }
    return null;
  }

  static List<BidFloor> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidFloor>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidFloor.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BidFloor> mapFromJson(dynamic json) {
    final map = <String, BidFloor>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BidFloor.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BidFloor-objects as value to a dart map
  static Map<String, List<BidFloor>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BidFloor>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BidFloor.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

