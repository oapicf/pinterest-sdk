//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_deletion_request_status.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request.g.dart';

/// Conversion deletion request
///
/// Properties:
/// * [createdTime] - Timestamp when the conversion deletion request was succesfully created.
/// * [processedTime] - Timestamp when the conversion deletion request was processed.
/// * [requestId] - Unique identifier of the conversion deletion request
/// * [status] - Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
@BuiltValue()
abstract class ConversionDeletionRequest implements Built<ConversionDeletionRequest, ConversionDeletionRequestBuilder> {
  /// Timestamp when the conversion deletion request was succesfully created.
  @BuiltValueField(wireName: r'created_time')
  Date get createdTime;

  /// Timestamp when the conversion deletion request was processed.
  @BuiltValueField(wireName: r'processed_time')
  Date? get processedTime;

  /// Unique identifier of the conversion deletion request
  @BuiltValueField(wireName: r'request_id')
  String get requestId;

  /// Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
  @BuiltValueField(wireName: r'status')
  ConversionDeletionRequestStatus get status;
  // enum statusEnum {  PENDING,  SUBMITTED,  CANCELLED,  };

  ConversionDeletionRequest._();

  factory ConversionDeletionRequest([void updates(ConversionDeletionRequestBuilder b)]) = _$ConversionDeletionRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequest> get serializer => _$ConversionDeletionRequestSerializer();
}

class _$ConversionDeletionRequestSerializer implements PrimitiveSerializer<ConversionDeletionRequest> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequest, _$ConversionDeletionRequest];

  @override
  final String wireName = r'ConversionDeletionRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'created_time';
    yield serializers.serialize(
      object.createdTime,
      specifiedType: const FullType(Date),
    );
    if (object.processedTime != null) {
      yield r'processed_time';
      yield serializers.serialize(
        object.processedTime,
        specifiedType: const FullType.nullable(Date),
      );
    }
    yield r'request_id';
    yield serializers.serialize(
      object.requestId,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(ConversionDeletionRequestStatus),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionDeletionRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Date),
          ) as Date;
          result.createdTime = valueDes;
          break;
        case r'processed_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.processedTime = valueDes;
          break;
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionDeletionRequestStatus),
          ) as ConversionDeletionRequestStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionDeletionRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

