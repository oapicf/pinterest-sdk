//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUploadCreateResponse {
  /// Returns a new [CustomerListUploadCreateResponse] instance.
  CustomerListUploadCreateResponse({
    required this.customerListUpload,
    required this.s3MultipartUploadData,
  });

  CustomerListUpload customerListUpload;

  S3MultipartUploadData s3MultipartUploadData;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUploadCreateResponse &&
    other.customerListUpload == customerListUpload &&
    other.s3MultipartUploadData == s3MultipartUploadData;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customerListUpload.hashCode) +
    (s3MultipartUploadData.hashCode);

  @override
  String toString() => 'CustomerListUploadCreateResponse[customerListUpload=$customerListUpload, s3MultipartUploadData=$s3MultipartUploadData]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'customer_list_upload'] = this.customerListUpload;
      json[r's3_multipart_upload_data'] = this.s3MultipartUploadData;
    return json;
  }

  /// Returns a new [CustomerListUploadCreateResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUploadCreateResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CustomerListUploadCreateResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CustomerListUploadCreateResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CustomerListUploadCreateResponse(
        customerListUpload: CustomerListUpload.fromJson(json[r'customer_list_upload'])!,
        s3MultipartUploadData: S3MultipartUploadData.fromJson(json[r's3_multipart_upload_data'])!,
      );
    }
    return null;
  }

  static List<CustomerListUploadCreateResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUploadCreateResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUploadCreateResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUploadCreateResponse> mapFromJson(dynamic json) {
    final map = <String, CustomerListUploadCreateResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUploadCreateResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUploadCreateResponse-objects as value to a dart map
  static Map<String, List<CustomerListUploadCreateResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUploadCreateResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUploadCreateResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'customer_list_upload',
    's3_multipart_upload_data',
  };
}

