//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'terms_of_service.g.dart';

/// The ID of the ad account.
///
/// Properties:
/// * [adAccountId] - The ID of the ad account.
/// * [hasAccepted] - Whether the ad account has accepted terms of service.
/// * [html] - The terms of service content
/// * [id] - The ID of the terms of service
@BuiltValue()
abstract class TermsOfService implements Built<TermsOfService, TermsOfServiceBuilder> {
  /// The ID of the ad account.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Whether the ad account has accepted terms of service.
  @BuiltValueField(wireName: r'has_accepted')
  bool? get hasAccepted;

  /// The terms of service content
  @BuiltValueField(wireName: r'html')
  String? get html;

  /// The ID of the terms of service
  @BuiltValueField(wireName: r'id')
  String? get id;

  TermsOfService._();

  factory TermsOfService([void updates(TermsOfServiceBuilder b)]) = _$TermsOfService;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TermsOfServiceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TermsOfService> get serializer => _$TermsOfServiceSerializer();
}

class _$TermsOfServiceSerializer implements PrimitiveSerializer<TermsOfService> {
  @override
  final Iterable<Type> types = const [TermsOfService, _$TermsOfService];

  @override
  final String wireName = r'TermsOfService';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TermsOfService object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.hasAccepted != null) {
      yield r'has_accepted';
      yield serializers.serialize(
        object.hasAccepted,
        specifiedType: const FullType(bool),
      );
    }
    if (object.html != null) {
      yield r'html';
      yield serializers.serialize(
        object.html,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TermsOfService object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TermsOfServiceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'has_accepted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.hasAccepted = valueDes;
          break;
        case r'html':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.html = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TermsOfService deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TermsOfServiceBuilder();
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

