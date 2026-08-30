//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credit_redeem.g.dart';

/// Ads credit redemption
///
/// Properties:
/// * [errorCode] - Error code type if error occurs
/// * [errorMessage] - Reason for failure
/// * [success] - Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
@BuiltValue()
abstract class AdsCreditRedeem implements Built<AdsCreditRedeem, AdsCreditRedeemBuilder> {
  /// Error code type if error occurs
  @BuiltValueField(wireName: r'errorCode')
  int? get errorCode;

  /// Reason for failure
  @BuiltValueField(wireName: r'errorMessage')
  String? get errorMessage;

  /// Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  @BuiltValueField(wireName: r'success')
  bool? get success;

  AdsCreditRedeem._();

  factory AdsCreditRedeem([void updates(AdsCreditRedeemBuilder b)]) = _$AdsCreditRedeem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsCreditRedeemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsCreditRedeem> get serializer => _$AdsCreditRedeemSerializer();
}

class _$AdsCreditRedeemSerializer implements PrimitiveSerializer<AdsCreditRedeem> {
  @override
  final Iterable<Type> types = const [AdsCreditRedeem, _$AdsCreditRedeem];

  @override
  final String wireName = r'AdsCreditRedeem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsCreditRedeem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errorCode != null) {
      yield r'errorCode';
      yield serializers.serialize(
        object.errorCode,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.errorMessage != null) {
      yield r'errorMessage';
      yield serializers.serialize(
        object.errorMessage,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.success != null) {
      yield r'success';
      yield serializers.serialize(
        object.success,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsCreditRedeem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsCreditRedeemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errorCode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.errorCode = valueDes;
          break;
        case r'errorMessage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.errorMessage = valueDes;
          break;
        case r'success':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.success = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdsCreditRedeem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsCreditRedeemBuilder();
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

