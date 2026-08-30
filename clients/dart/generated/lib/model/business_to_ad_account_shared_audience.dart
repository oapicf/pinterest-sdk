//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessToAdAccountSharedAudience {
  /// Returns a new [BusinessToAdAccountSharedAudience] instance.
  BusinessToAdAccountSharedAudience({
    required this.audienceId,
    this.permissions = const [],
    this.recipientAccountIds = const [],
  });

  /// Unique identifier of an audience
  String audienceId;

  /// Permissions granted to the recipients.
  List<Role> permissions;

  /// Ad account IDs to share with or revoke from (request) / that received the audience (response).
  List<String> recipientAccountIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessToAdAccountSharedAudience &&
    other.audienceId == audienceId &&
    _deepEquality.equals(other.permissions, permissions) &&
    _deepEquality.equals(other.recipientAccountIds, recipientAccountIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId.hashCode) +
    (permissions.hashCode) +
    (recipientAccountIds.hashCode);

  @override
  String toString() => 'BusinessToAdAccountSharedAudience[audienceId=$audienceId, permissions=$permissions, recipientAccountIds=$recipientAccountIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_id'] = this.audienceId;
      json[r'permissions'] = this.permissions;
      json[r'recipient_account_ids'] = this.recipientAccountIds;
    return json;
  }

  /// Returns a new [BusinessToAdAccountSharedAudience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessToAdAccountSharedAudience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_id'), 'Required key "BusinessToAdAccountSharedAudience[audience_id]" is missing from JSON.');
        assert(json[r'audience_id'] != null, 'Required key "BusinessToAdAccountSharedAudience[audience_id]" has a null value in JSON.');
        assert(json.containsKey(r'recipient_account_ids'), 'Required key "BusinessToAdAccountSharedAudience[recipient_account_ids]" is missing from JSON.');
        assert(json[r'recipient_account_ids'] != null, 'Required key "BusinessToAdAccountSharedAudience[recipient_account_ids]" has a null value in JSON.');
        return true;
      }());

      return BusinessToAdAccountSharedAudience(
        audienceId: mapValueOfType<String>(json, r'audience_id')!,
        permissions: Role.listFromJson(json[r'permissions']),
        recipientAccountIds: json[r'recipient_account_ids'] is Iterable
            ? (json[r'recipient_account_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<BusinessToAdAccountSharedAudience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessToAdAccountSharedAudience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessToAdAccountSharedAudience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessToAdAccountSharedAudience> mapFromJson(dynamic json) {
    final map = <String, BusinessToAdAccountSharedAudience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessToAdAccountSharedAudience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessToAdAccountSharedAudience-objects as value to a dart map
  static Map<String, List<BusinessToAdAccountSharedAudience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessToAdAccountSharedAudience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessToAdAccountSharedAudience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_id',
    'recipient_account_ids',
  };
}

