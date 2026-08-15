//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/s3_file_part.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 's3_multipart_upload_data.g.dart';

/// S3MultipartUploadData
///
/// Properties:
/// * [fileParts] - Array of file parts with pre-signed URLs.
@BuiltValue()
abstract class S3MultipartUploadData implements Built<S3MultipartUploadData, S3MultipartUploadDataBuilder> {
  /// Array of file parts with pre-signed URLs.
  @BuiltValueField(wireName: r'file_parts')
  BuiltList<S3FilePart>? get fileParts;

  S3MultipartUploadData._();

  factory S3MultipartUploadData([void updates(S3MultipartUploadDataBuilder b)]) = _$S3MultipartUploadData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(S3MultipartUploadDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<S3MultipartUploadData> get serializer => _$S3MultipartUploadDataSerializer();
}

class _$S3MultipartUploadDataSerializer implements PrimitiveSerializer<S3MultipartUploadData> {
  @override
  final Iterable<Type> types = const [S3MultipartUploadData, _$S3MultipartUploadData];

  @override
  final String wireName = r'S3MultipartUploadData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    S3MultipartUploadData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileParts != null) {
      yield r'file_parts';
      yield serializers.serialize(
        object.fileParts,
        specifiedType: const FullType(BuiltList, [FullType(S3FilePart)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    S3MultipartUploadData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required S3MultipartUploadDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_parts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(S3FilePart)]),
          ) as BuiltList<S3FilePart>;
          result.fileParts.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  S3MultipartUploadData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = S3MultipartUploadDataBuilder();
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

