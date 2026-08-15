//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdatePartnerResultsResponseArrayItemsInner {
  /// Returns a new [UpdatePartnerResultsResponseArrayItemsInner] instance.
  UpdatePartnerResultsResponseArrayItemsInner({
    this.exception,
    this.memberOrPartnerId,
  });

  BusinessAccessError? exception;

  String? memberOrPartnerId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdatePartnerResultsResponseArrayItemsInner &&
    other.exception == exception &&
    other.memberOrPartnerId == memberOrPartnerId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exception == null ? 0 : exception!.hashCode) +
    (memberOrPartnerId == null ? 0 : memberOrPartnerId!.hashCode);

  @override
  String toString() => 'UpdatePartnerResultsResponseArrayItemsInner[exception=$exception, memberOrPartnerId=$memberOrPartnerId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.exception != null) {
      json[r'exception'] = this.exception;
    } else {
      json[r'exception'] = null;
    }
    if (this.memberOrPartnerId != null) {
      json[r'member_or_partner_id'] = this.memberOrPartnerId;
    } else {
      json[r'member_or_partner_id'] = null;
    }
    return json;
  }

  /// Returns a new [UpdatePartnerResultsResponseArrayItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdatePartnerResultsResponseArrayItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdatePartnerResultsResponseArrayItemsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdatePartnerResultsResponseArrayItemsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdatePartnerResultsResponseArrayItemsInner(
        exception: BusinessAccessError.fromJson(json[r'exception']),
        memberOrPartnerId: mapValueOfType<String>(json, r'member_or_partner_id'),
      );
    }
    return null;
  }

  static List<UpdatePartnerResultsResponseArrayItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdatePartnerResultsResponseArrayItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdatePartnerResultsResponseArrayItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdatePartnerResultsResponseArrayItemsInner> mapFromJson(dynamic json) {
    final map = <String, UpdatePartnerResultsResponseArrayItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdatePartnerResultsResponseArrayItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdatePartnerResultsResponseArrayItemsInner-objects as value to a dart map
  static Map<String, List<UpdatePartnerResultsResponseArrayItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdatePartnerResultsResponseArrayItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdatePartnerResultsResponseArrayItemsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

