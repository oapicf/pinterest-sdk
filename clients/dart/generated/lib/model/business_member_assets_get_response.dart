//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessMemberAssetsGetResponse {
  /// Returns a new [BusinessMemberAssetsGetResponse] instance.
  BusinessMemberAssetsGetResponse({
    this.bookmark,
    this.items = const [],
    required this.totalDataCount,
    this.totalDataCountByStatus,
  });

  String? bookmark;

  List<AssetIdPermissions> items;

  /// Total number of assets matching the query
  int totalDataCount;

  /// Breakdown of asset counts by entity status (ad accounts only)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TotalCountByEntityStatus? totalDataCountByStatus;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessMemberAssetsGetResponse &&
    other.bookmark == bookmark &&
    _deepEquality.equals(other.items, items) &&
    other.totalDataCount == totalDataCount &&
    other.totalDataCountByStatus == totalDataCountByStatus;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bookmark == null ? 0 : bookmark!.hashCode) +
    (items.hashCode) +
    (totalDataCount.hashCode) +
    (totalDataCountByStatus == null ? 0 : totalDataCountByStatus!.hashCode);

  @override
  String toString() => 'BusinessMemberAssetsGetResponse[bookmark=$bookmark, items=$items, totalDataCount=$totalDataCount, totalDataCountByStatus=$totalDataCountByStatus]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bookmark != null) {
      json[r'bookmark'] = this.bookmark;
    } else {
      json[r'bookmark'] = null;
    }
      json[r'items'] = this.items;
      json[r'total_data_count'] = this.totalDataCount;
    if (this.totalDataCountByStatus != null) {
      json[r'total_data_count_by_status'] = this.totalDataCountByStatus;
    } else {
      json[r'total_data_count_by_status'] = null;
    }
    return json;
  }

  /// Returns a new [BusinessMemberAssetsGetResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessMemberAssetsGetResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'items'), 'Required key "BusinessMemberAssetsGetResponse[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "BusinessMemberAssetsGetResponse[items]" has a null value in JSON.');
        assert(json.containsKey(r'total_data_count'), 'Required key "BusinessMemberAssetsGetResponse[total_data_count]" is missing from JSON.');
        assert(json[r'total_data_count'] != null, 'Required key "BusinessMemberAssetsGetResponse[total_data_count]" has a null value in JSON.');
        return true;
      }());

      return BusinessMemberAssetsGetResponse(
        bookmark: mapValueOfType<String>(json, r'bookmark'),
        items: AssetIdPermissions.listFromJson(json[r'items']),
        totalDataCount: mapValueOfType<int>(json, r'total_data_count')!,
        totalDataCountByStatus: TotalCountByEntityStatus.fromJson(json[r'total_data_count_by_status']),
      );
    }
    return null;
  }

  static List<BusinessMemberAssetsGetResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessMemberAssetsGetResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessMemberAssetsGetResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessMemberAssetsGetResponse> mapFromJson(dynamic json) {
    final map = <String, BusinessMemberAssetsGetResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessMemberAssetsGetResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessMemberAssetsGetResponse-objects as value to a dart map
  static Map<String, List<BusinessMemberAssetsGetResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessMemberAssetsGetResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessMemberAssetsGetResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'items',
    'total_data_count',
  };
}

