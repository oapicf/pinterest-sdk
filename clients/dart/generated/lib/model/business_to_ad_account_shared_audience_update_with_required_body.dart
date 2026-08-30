//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {
  /// Returns a new [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] instance.
  BusinessToAdAccountSharedAudienceUpdateWithRequiredBody({
    required this.audienceId,
    required this.operationType,
    this.recipientAccountIds = const [],
  });

  /// Unique identifier of an audience
  String audienceId;

  OperationType operationType;

  /// Ad account IDs to share with or revoke from (request) / that received the audience (response).
  List<String> recipientAccountIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessToAdAccountSharedAudienceUpdateWithRequiredBody &&
    other.audienceId == audienceId &&
    other.operationType == operationType &&
    _deepEquality.equals(other.recipientAccountIds, recipientAccountIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId.hashCode) +
    (operationType.hashCode) +
    (recipientAccountIds.hashCode);

  @override
  String toString() => 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[audienceId=$audienceId, operationType=$operationType, recipientAccountIds=$recipientAccountIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_id'] = this.audienceId;
      json[r'operation_type'] = this.operationType;
      json[r'recipient_account_ids'] = this.recipientAccountIds;
    return json;
  }

  /// Returns a new [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessToAdAccountSharedAudienceUpdateWithRequiredBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_id'), 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[audience_id]" is missing from JSON.');
        assert(json[r'audience_id'] != null, 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[audience_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation_type'), 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[operation_type]" is missing from JSON.');
        assert(json[r'operation_type'] != null, 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[operation_type]" has a null value in JSON.');
        assert(json.containsKey(r'recipient_account_ids'), 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[recipient_account_ids]" is missing from JSON.');
        assert(json[r'recipient_account_ids'] != null, 'Required key "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody[recipient_account_ids]" has a null value in JSON.');
        return true;
      }());

      return BusinessToAdAccountSharedAudienceUpdateWithRequiredBody(
        audienceId: mapValueOfType<String>(json, r'audience_id')!,
        operationType: OperationType.fromJson(json[r'operation_type'])!,
        recipientAccountIds: json[r'recipient_account_ids'] is Iterable
            ? (json[r'recipient_account_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<BusinessToAdAccountSharedAudienceUpdateWithRequiredBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody> mapFromJson(dynamic json) {
    final map = <String, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessToAdAccountSharedAudienceUpdateWithRequiredBody-objects as value to a dart map
  static Map<String, List<BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_id',
    'operation_type',
    'recipient_account_ids',
  };
}

