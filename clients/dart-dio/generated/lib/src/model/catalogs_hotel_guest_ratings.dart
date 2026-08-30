//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_guest_ratings.g.dart';

/// CatalogsHotelGuestRatings
///
/// Properties:
/// * [maxScore] - Max value for the hotel rating score.
/// * [numberOfReviewers] - Total number of people who have rated this hotel.
/// * [ratingSystem] - System you use for guest reviews.
/// * [score] - Your hotel's rating.
@BuiltValue()
abstract class CatalogsHotelGuestRatings implements Built<CatalogsHotelGuestRatings, CatalogsHotelGuestRatingsBuilder> {
  /// Max value for the hotel rating score.
  @BuiltValueField(wireName: r'max_score')
  num? get maxScore;

  /// Total number of people who have rated this hotel.
  @BuiltValueField(wireName: r'number_of_reviewers')
  int? get numberOfReviewers;

  /// System you use for guest reviews.
  @BuiltValueField(wireName: r'rating_system')
  String? get ratingSystem;

  /// Your hotel's rating.
  @BuiltValueField(wireName: r'score')
  num? get score;

  CatalogsHotelGuestRatings._();

  factory CatalogsHotelGuestRatings([void updates(CatalogsHotelGuestRatingsBuilder b)]) = _$CatalogsHotelGuestRatings;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelGuestRatingsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelGuestRatings> get serializer => _$CatalogsHotelGuestRatingsSerializer();
}

class _$CatalogsHotelGuestRatingsSerializer implements PrimitiveSerializer<CatalogsHotelGuestRatings> {
  @override
  final Iterable<Type> types = const [CatalogsHotelGuestRatings, _$CatalogsHotelGuestRatings];

  @override
  final String wireName = r'CatalogsHotelGuestRatings';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelGuestRatings object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxScore != null) {
      yield r'max_score';
      yield serializers.serialize(
        object.maxScore,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.numberOfReviewers != null) {
      yield r'number_of_reviewers';
      yield serializers.serialize(
        object.numberOfReviewers,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.ratingSystem != null) {
      yield r'rating_system';
      yield serializers.serialize(
        object.ratingSystem,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.score != null) {
      yield r'score';
      yield serializers.serialize(
        object.score,
        specifiedType: const FullType.nullable(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelGuestRatings object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelGuestRatingsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.maxScore = valueDes;
          break;
        case r'number_of_reviewers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.numberOfReviewers = valueDes;
          break;
        case r'rating_system':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.ratingSystem = valueDes;
          break;
        case r'score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.score = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelGuestRatings deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelGuestRatingsBuilder();
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

