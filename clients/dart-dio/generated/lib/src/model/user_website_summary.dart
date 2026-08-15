//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_website_summary.g.dart';

/// UserWebsiteSummary
///
/// Properties:
/// * [status] - Status of the verification process
/// * [verifiedAt] - UTC timestamp when the verification happened - sometimes missing
/// * [website] - Website with path or domain only
@BuiltValue()
abstract class UserWebsiteSummary implements Built<UserWebsiteSummary, UserWebsiteSummaryBuilder> {
  /// Status of the verification process
  @BuiltValueField(wireName: r'status')
  String? get status;

  /// UTC timestamp when the verification happened - sometimes missing
  @BuiltValueField(wireName: r'verified_at')
  String? get verifiedAt;

  /// Website with path or domain only
  @BuiltValueField(wireName: r'website')
  String? get website;

  UserWebsiteSummary._();

  factory UserWebsiteSummary([void updates(UserWebsiteSummaryBuilder b)]) = _$UserWebsiteSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserWebsiteSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserWebsiteSummary> get serializer => _$UserWebsiteSummarySerializer();
}

class _$UserWebsiteSummarySerializer implements PrimitiveSerializer<UserWebsiteSummary> {
  @override
  final Iterable<Type> types = const [UserWebsiteSummary, _$UserWebsiteSummary];

  @override
  final String wireName = r'UserWebsiteSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserWebsiteSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
    if (object.verifiedAt != null) {
      yield r'verified_at';
      yield serializers.serialize(
        object.verifiedAt,
        specifiedType: const FullType(String),
      );
    }
    if (object.website != null) {
      yield r'website';
      yield serializers.serialize(
        object.website,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UserWebsiteSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserWebsiteSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.status = valueDes;
          break;
        case r'verified_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.verifiedAt = valueDes;
          break;
        case r'website':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.website = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserWebsiteSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserWebsiteSummaryBuilder();
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

