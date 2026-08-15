//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 's3_file_part.g.dart';

/// S3FilePart
///
/// Properties:
/// * [partNumber] - Part number for upload.
/// * [presignedUrl] - Pre-signed URL.
@BuiltValue()
abstract class S3FilePart implements Built<S3FilePart, S3FilePartBuilder> {
  /// Part number for upload.
  @BuiltValueField(wireName: r'part_number')
  int get partNumber;

  /// Pre-signed URL.
  @BuiltValueField(wireName: r'presigned_url')
  String get presignedUrl;

  S3FilePart._();

  factory S3FilePart([void updates(S3FilePartBuilder b)]) = _$S3FilePart;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(S3FilePartBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<S3FilePart> get serializer => _$S3FilePartSerializer();
}

class _$S3FilePartSerializer implements PrimitiveSerializer<S3FilePart> {
  @override
  final Iterable<Type> types = const [S3FilePart, _$S3FilePart];

  @override
  final String wireName = r'S3FilePart';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    S3FilePart object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'part_number';
    yield serializers.serialize(
      object.partNumber,
      specifiedType: const FullType(int),
    );
    yield r'presigned_url';
    yield serializers.serialize(
      object.presignedUrl,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    S3FilePart object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required S3FilePartBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'part_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.partNumber = valueDes;
          break;
        case r'presigned_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.presignedUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  S3FilePart deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = S3FilePartBuilder();
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

