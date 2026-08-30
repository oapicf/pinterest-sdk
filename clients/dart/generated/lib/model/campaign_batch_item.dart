//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignBatchItem {
  /// Returns a new [CampaignBatchItem] instance.
  CampaignBatchItem({
    this.data,
    this.exceptions = const [],
  });

  /// Campaign data on success.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignBatchResponseData? data;

  /// Exceptions on failure.
  List<Exception> exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignBatchItem &&
    other.data == data &&
    _deepEquality.equals(other.exceptions, exceptions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (exceptions.hashCode);

  @override
  String toString() => 'CampaignBatchItem[data=$data, exceptions=$exceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
      json[r'exceptions'] = this.exceptions;
    return json;
  }

  /// Returns a new [CampaignBatchItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignBatchItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignBatchItem(
        data: CampaignBatchResponseData.fromJson(json[r'data']),
        exceptions: Exception.listFromJson(json[r'exceptions']),
      );
    }
    return null;
  }

  static List<CampaignBatchItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBatchItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBatchItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignBatchItem> mapFromJson(dynamic json) {
    final map = <String, CampaignBatchItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignBatchItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignBatchItem-objects as value to a dart map
  static Map<String, List<CampaignBatchItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignBatchItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignBatchItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

