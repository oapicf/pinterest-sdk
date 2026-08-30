//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_upload_url.g.dart';

/// DynamicTitlesUploadURL
///
/// Properties:
/// * [existingFilename] - If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
/// * [requestId] - Unique identifier for this upload session. Must be passed to the process endpoint.
/// * [uploadUrl] - Pre-signed S3 PUT URL to upload the reviewed CSV file.
@BuiltValue()
abstract class DynamicTitlesUploadURL implements Built<DynamicTitlesUploadURL, DynamicTitlesUploadURLBuilder> {
  /// If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
  @BuiltValueField(wireName: r'existing_filename')
  String? get existingFilename;

  /// Unique identifier for this upload session. Must be passed to the process endpoint.
  @BuiltValueField(wireName: r'request_id')
  String get requestId;

  /// Pre-signed S3 PUT URL to upload the reviewed CSV file.
  @BuiltValueField(wireName: r'upload_url')
  String get uploadUrl;

  DynamicTitlesUploadURL._();

  factory DynamicTitlesUploadURL([void updates(DynamicTitlesUploadURLBuilder b)]) = _$DynamicTitlesUploadURL;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesUploadURLBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesUploadURL> get serializer => _$DynamicTitlesUploadURLSerializer();
}

class _$DynamicTitlesUploadURLSerializer implements PrimitiveSerializer<DynamicTitlesUploadURL> {
  @override
  final Iterable<Type> types = const [DynamicTitlesUploadURL, _$DynamicTitlesUploadURL];

  @override
  final String wireName = r'DynamicTitlesUploadURL';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesUploadURL object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.existingFilename != null) {
      yield r'existing_filename';
      yield serializers.serialize(
        object.existingFilename,
        specifiedType: const FullType(String),
      );
    }
    yield r'request_id';
    yield serializers.serialize(
      object.requestId,
      specifiedType: const FullType(String),
    );
    yield r'upload_url';
    yield serializers.serialize(
      object.uploadUrl,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesUploadURL object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesUploadURLBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'existing_filename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.existingFilename = valueDes;
          break;
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        case r'upload_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.uploadUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesUploadURL deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesUploadURLBuilder();
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

