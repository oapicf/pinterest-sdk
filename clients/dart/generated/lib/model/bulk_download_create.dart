//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkDownloadCreate {
  /// Returns a new [BulkDownloadCreate] instance.
  BulkDownloadCreate({
    this.campaignFilter,
    this.entityIds = const [],
    this.entityTypes = const [],
    this.outputFormat = BulkOutputFormat.JSON,
    this.updatedSince,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BulkDownloadCampaignFilter? campaignFilter;

  /// All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  List<String> entityIds;

  /// All entity types specified will be downloaded. Fewer types result in faster downloads.
  List<BulkEntityType> entityTypes;

  BulkOutputFormat outputFormat;

  /// Unix UTC timestamp to retrieve all entities that have changed since this time.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? updatedSince;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkDownloadCreate &&
    other.campaignFilter == campaignFilter &&
    _deepEquality.equals(other.entityIds, entityIds) &&
    _deepEquality.equals(other.entityTypes, entityTypes) &&
    other.outputFormat == outputFormat &&
    other.updatedSince == updatedSince;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignFilter == null ? 0 : campaignFilter!.hashCode) +
    (entityIds.hashCode) +
    (entityTypes.hashCode) +
    (outputFormat.hashCode) +
    (updatedSince == null ? 0 : updatedSince!.hashCode);

  @override
  String toString() => 'BulkDownloadCreate[campaignFilter=$campaignFilter, entityIds=$entityIds, entityTypes=$entityTypes, outputFormat=$outputFormat, updatedSince=$updatedSince]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.campaignFilter != null) {
      json[r'campaign_filter'] = this.campaignFilter;
    } else {
      json[r'campaign_filter'] = null;
    }
      json[r'entity_ids'] = this.entityIds;
      json[r'entity_types'] = this.entityTypes;
      json[r'output_format'] = this.outputFormat;
    if (this.updatedSince != null) {
      json[r'updated_since'] = this.updatedSince;
    } else {
      json[r'updated_since'] = null;
    }
    return json;
  }

  /// Returns a new [BulkDownloadCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkDownloadCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BulkDownloadCreate(
        campaignFilter: BulkDownloadCampaignFilter.fromJson(json[r'campaign_filter']),
        entityIds: json[r'entity_ids'] is Iterable
            ? (json[r'entity_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        entityTypes: BulkEntityType.listFromJson(json[r'entity_types']),
        outputFormat: BulkOutputFormat.fromJson(json[r'output_format']) ?? BulkOutputFormat.JSON,
        updatedSince: mapValueOfType<String>(json, r'updated_since'),
      );
    }
    return null;
  }

  static List<BulkDownloadCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkDownloadCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkDownloadCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkDownloadCreate> mapFromJson(dynamic json) {
    final map = <String, BulkDownloadCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkDownloadCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkDownloadCreate-objects as value to a dart map
  static Map<String, List<BulkDownloadCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkDownloadCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkDownloadCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

