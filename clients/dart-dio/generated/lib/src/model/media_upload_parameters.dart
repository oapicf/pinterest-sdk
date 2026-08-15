//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_upload_parameters.g.dart';

/// MediaUploadParameters
///
/// Properties:
/// * [contentType] 
/// * [key] 
/// * [policy] 
/// * [xAmzAlgorithm] 
/// * [xAmzCredential] 
/// * [xAmzDate] 
/// * [xAmzSecurityToken] 
/// * [xAmzSignature] 
@BuiltValue()
abstract class MediaUploadParameters implements Built<MediaUploadParameters, MediaUploadParametersBuilder> {
  @BuiltValueField(wireName: r'Content-Type')
  String? get contentType;

  @BuiltValueField(wireName: r'key')
  String? get key;

  @BuiltValueField(wireName: r'policy')
  String? get policy;

  @BuiltValueField(wireName: r'x-amz-algorithm')
  String? get xAmzAlgorithm;

  @BuiltValueField(wireName: r'x-amz-credential')
  String? get xAmzCredential;

  @BuiltValueField(wireName: r'x-amz-date')
  String? get xAmzDate;

  @BuiltValueField(wireName: r'x-amz-security-token')
  String? get xAmzSecurityToken;

  @BuiltValueField(wireName: r'x-amz-signature')
  String? get xAmzSignature;

  MediaUploadParameters._();

  factory MediaUploadParameters([void updates(MediaUploadParametersBuilder b)]) = _$MediaUploadParameters;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaUploadParametersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MediaUploadParameters> get serializer => _$MediaUploadParametersSerializer();
}

class _$MediaUploadParametersSerializer implements PrimitiveSerializer<MediaUploadParameters> {
  @override
  final Iterable<Type> types = const [MediaUploadParameters, _$MediaUploadParameters];

  @override
  final String wireName = r'MediaUploadParameters';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MediaUploadParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contentType != null) {
      yield r'Content-Type';
      yield serializers.serialize(
        object.contentType,
        specifiedType: const FullType(String),
      );
    }
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.policy != null) {
      yield r'policy';
      yield serializers.serialize(
        object.policy,
        specifiedType: const FullType(String),
      );
    }
    if (object.xAmzAlgorithm != null) {
      yield r'x-amz-algorithm';
      yield serializers.serialize(
        object.xAmzAlgorithm,
        specifiedType: const FullType(String),
      );
    }
    if (object.xAmzCredential != null) {
      yield r'x-amz-credential';
      yield serializers.serialize(
        object.xAmzCredential,
        specifiedType: const FullType(String),
      );
    }
    if (object.xAmzDate != null) {
      yield r'x-amz-date';
      yield serializers.serialize(
        object.xAmzDate,
        specifiedType: const FullType(String),
      );
    }
    if (object.xAmzSecurityToken != null) {
      yield r'x-amz-security-token';
      yield serializers.serialize(
        object.xAmzSecurityToken,
        specifiedType: const FullType(String),
      );
    }
    if (object.xAmzSignature != null) {
      yield r'x-amz-signature';
      yield serializers.serialize(
        object.xAmzSignature,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MediaUploadParameters object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaUploadParametersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'Content-Type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.contentType = valueDes;
          break;
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.key = valueDes;
          break;
        case r'policy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.policy = valueDes;
          break;
        case r'x-amz-algorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.xAmzAlgorithm = valueDes;
          break;
        case r'x-amz-credential':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.xAmzCredential = valueDes;
          break;
        case r'x-amz-date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.xAmzDate = valueDes;
          break;
        case r'x-amz-security-token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.xAmzSecurityToken = valueDes;
          break;
        case r'x-amz-signature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.xAmzSignature = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MediaUploadParameters deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaUploadParametersBuilder();
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

