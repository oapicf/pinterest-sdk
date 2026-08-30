//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'appsflyer_audience_sync_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [containerId] - The container ID of the audience
/// * [urlAdidSha256] - The pre-signed URL for SHA256 hashed GAID/IDFA file
/// * [urlEmailSha256] - The pre-signed URL for SHA256 hashed email file
@BuiltValue()
abstract class AppsflyerAudienceSyncCreate implements Built<AppsflyerAudienceSyncCreate, AppsflyerAudienceSyncCreateBuilder> {
  /// The container ID of the audience
  @BuiltValueField(wireName: r'container_id')
  String get containerId;

  /// The pre-signed URL for SHA256 hashed GAID/IDFA file
  @BuiltValueField(wireName: r'url_adid_sha256')
  String? get urlAdidSha256;

  /// The pre-signed URL for SHA256 hashed email file
  @BuiltValueField(wireName: r'url_email_sha256')
  String? get urlEmailSha256;

  AppsflyerAudienceSyncCreate._();

  factory AppsflyerAudienceSyncCreate([void updates(AppsflyerAudienceSyncCreateBuilder b)]) = _$AppsflyerAudienceSyncCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AppsflyerAudienceSyncCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AppsflyerAudienceSyncCreate> get serializer => _$AppsflyerAudienceSyncCreateSerializer();
}

class _$AppsflyerAudienceSyncCreateSerializer implements PrimitiveSerializer<AppsflyerAudienceSyncCreate> {
  @override
  final Iterable<Type> types = const [AppsflyerAudienceSyncCreate, _$AppsflyerAudienceSyncCreate];

  @override
  final String wireName = r'AppsflyerAudienceSyncCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AppsflyerAudienceSyncCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'container_id';
    yield serializers.serialize(
      object.containerId,
      specifiedType: const FullType(String),
    );
    if (object.urlAdidSha256 != null) {
      yield r'url_adid_sha256';
      yield serializers.serialize(
        object.urlAdidSha256,
        specifiedType: const FullType(String),
      );
    }
    if (object.urlEmailSha256 != null) {
      yield r'url_email_sha256';
      yield serializers.serialize(
        object.urlEmailSha256,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AppsflyerAudienceSyncCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AppsflyerAudienceSyncCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'container_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.containerId = valueDes;
          break;
        case r'url_adid_sha256':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.urlAdidSha256 = valueDes;
          break;
        case r'url_email_sha256':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.urlEmailSha256 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AppsflyerAudienceSyncCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AppsflyerAudienceSyncCreateBuilder();
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

