//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request_status.g.dart';

class ConversionDeletionRequestStatus extends EnumClass {

  /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const ConversionDeletionRequestStatus PENDING = _$PENDING;
  /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  @BuiltValueEnumConst(wireName: r'SUBMITTED')
  static const ConversionDeletionRequestStatus SUBMITTED = _$SUBMITTED;
  /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  @BuiltValueEnumConst(wireName: r'CANCELLED')
  static const ConversionDeletionRequestStatus CANCELLED = _$CANCELLED;

  static Serializer<ConversionDeletionRequestStatus> get serializer => _$conversionDeletionRequestStatusSerializer;

  const ConversionDeletionRequestStatus._(String name): super(name);

  static BuiltSet<ConversionDeletionRequestStatus> get values => _$values;
  static ConversionDeletionRequestStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionDeletionRequestStatusMixin = Object with _$ConversionDeletionRequestStatusMixin;

