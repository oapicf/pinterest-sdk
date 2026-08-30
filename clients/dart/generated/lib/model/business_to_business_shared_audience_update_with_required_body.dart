//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessToBusinessSharedAudienceUpdateWithRequiredBody {
  /// Returns a new [BusinessToBusinessSharedAudienceUpdateWithRequiredBody] instance.
  BusinessToBusinessSharedAudienceUpdateWithRequiredBody({
    required this.audienceId,
    required this.operationType,
    this.recipientBusinessIds = const [],
  });

  /// Unique identifier of an audience
  String audienceId;

  OperationType operationType;

  /// Business IDs to share with or revoke from (request) / that received the audience (response).
  List<String> recipientBusinessIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessToBusinessSharedAudienceUpdateWithRequiredBody &&
    other.audienceId == audienceId &&
    other.operationType == operationType &&
    _deepEquality.equals(other.recipientBusinessIds, recipientBusinessIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId.hashCode) +
    (operationType.hashCode) +
    (recipientBusinessIds.hashCode);

  @override
  String toString() => 'BusinessToBusinessSharedAudienceUpdateWithRequiredBody[audienceId=$audienceId, operationType=$operationType, recipientBusinessIds=$recipientBusinessIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_id'] = this.audienceId;
      json[r'operation_type'] = this.operationType;
      json[r'recipient_business_ids'] = this.recipientBusinessIds;
    return json;
  }

  /// Returns a new [BusinessToBusinessSharedAudienceUpdateWithRequiredBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessToBusinessSharedAudienceUpdateWithRequiredBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'audience_id'), 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[audience_id]" is missing from JSON.');
        assert(json[r'audience_id'] != null, 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[audience_id]" has a null value in JSON.');
        assert(json.containsKey(r'operation_type'), 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[operation_type]" is missing from JSON.');
        assert(json[r'operation_type'] != null, 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[operation_type]" has a null value in JSON.');
        assert(json.containsKey(r'recipient_business_ids'), 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[recipient_business_ids]" is missing from JSON.');
        assert(json[r'recipient_business_ids'] != null, 'Required key "BusinessToBusinessSharedAudienceUpdateWithRequiredBody[recipient_business_ids]" has a null value in JSON.');
        return true;
      }());

      return BusinessToBusinessSharedAudienceUpdateWithRequiredBody(
        audienceId: mapValueOfType<String>(json, r'audience_id')!,
        operationType: OperationType.fromJson(json[r'operation_type'])!,
        recipientBusinessIds: json[r'recipient_business_ids'] is Iterable
            ? (json[r'recipient_business_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<BusinessToBusinessSharedAudienceUpdateWithRequiredBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessToBusinessSharedAudienceUpdateWithRequiredBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessToBusinessSharedAudienceUpdateWithRequiredBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessToBusinessSharedAudienceUpdateWithRequiredBody> mapFromJson(dynamic json) {
    final map = <String, BusinessToBusinessSharedAudienceUpdateWithRequiredBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessToBusinessSharedAudienceUpdateWithRequiredBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessToBusinessSharedAudienceUpdateWithRequiredBody-objects as value to a dart map
  static Map<String, List<BusinessToBusinessSharedAudienceUpdateWithRequiredBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessToBusinessSharedAudienceUpdateWithRequiredBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessToBusinessSharedAudienceUpdateWithRequiredBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_id',
    'operation_type',
    'recipient_business_ids',
  };
}

