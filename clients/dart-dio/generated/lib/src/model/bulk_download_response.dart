//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_download_response.g.dart';

/// BulkDownloadResponse
///
/// Properties:
/// * [requestId] - ID of the bulk request.
@BuiltValue()
abstract class BulkDownloadResponse implements Built<BulkDownloadResponse, BulkDownloadResponseBuilder> {
  /// ID of the bulk request.
  @BuiltValueField(wireName: r'request_id')
  String? get requestId;

  BulkDownloadResponse._();

  factory BulkDownloadResponse([void updates(BulkDownloadResponseBuilder b)]) = _$BulkDownloadResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkDownloadResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkDownloadResponse> get serializer => _$BulkDownloadResponseSerializer();
}

class _$BulkDownloadResponseSerializer implements PrimitiveSerializer<BulkDownloadResponse> {
  @override
  final Iterable<Type> types = const [BulkDownloadResponse, _$BulkDownloadResponse];

  @override
  final String wireName = r'BulkDownloadResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkDownloadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requestId != null) {
      yield r'request_id';
      yield serializers.serialize(
        object.requestId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkDownloadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkDownloadResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkDownloadResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkDownloadResponseBuilder();
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

